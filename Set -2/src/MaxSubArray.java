public class MaxSubArray
{
    public static void main(String[] args) {
        
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        int maxSum = findMaxSum(num);

        // Output the result
        System.out.println("The largest sum is: " + maxSum);
    }


    public static int findMaxSum(int[] nums)
    {
        int current = nums[0];
        int max = nums[0];


        for (int i = 1; i < nums.length; i++) {

            current = Math.max(nums[i], current + nums[i]);

            max = Math.max(max, current);
        }

        return max;
    }
}
