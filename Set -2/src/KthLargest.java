public class KthLargest
{
    public static void main(String[] args)
    {

        int[] num = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = findKthLargest(num, k);

        System.out.println("The " + k + "th largest element is " + result);
    }

    public static int findKthLargest(int[] nums, int k)
    {

        int minValue = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++)
        {

            int maxIndex = 0;

            for (int j = 1; j < nums.length; j++)
            {
                if (nums[j] > nums[maxIndex])
                {
                    maxIndex = j;
                }
            }

            if (i == k - 1)
            {
                return nums[maxIndex];
            }

            nums[maxIndex] = minValue--;
        }
        return -1;
    }
}
