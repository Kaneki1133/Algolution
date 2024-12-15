public class CountInversion
{


    public static int countInvert(int[] arr)
    {
        int n = arr.length;
        int count = 0;


        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                // If arr[i] > arr[j] then it is Inversion
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args)
    {
        int[] arr = {7, 2, 6, 3};
        int result = countInvert(arr);
        System.out.println("Number of inversions: " + result);
    }
}
