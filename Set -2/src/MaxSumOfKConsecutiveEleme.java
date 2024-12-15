public class MaxSumOfKConsecutiveEleme
{
    public static void main(String[] args)
    {
        int[] arr1 = {100, 200, 300, 400};
        int k1 = 2;

        System.out.println("Maximum sum: " + maxSum(arr1, k1));

        int[] arr2 = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k2 = 4;

        System.out.println("Maximum sum: " + maxSum(arr2, k2));

        int[] arr3 = {2, 3};
        int k3 = 3;

        System.out.println("Maximum sum: " + maxSum(arr3, k3));
    }

    public static String maxSum(int[] arr, int k)
    {
        int n = arr.length;

        // less than k, return "Invalid"
        if (n < k)
        {
            return "Invalid";
        }


        int maxSum = 0;
        for (int i = 0; i < k; i++)
        {
            maxSum += arr[i];
        }


        int newSum = maxSum;
        for (int i = k; i < n; i++)
        {
            newSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, newSum);
        }

        return String.valueOf(maxSum);
    }
}
