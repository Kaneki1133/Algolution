public class PairSum
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 4, 5, 7, 11};
        int x = 9;

        if (hasPairWithSumNaive(a, x))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    public static boolean hasPairWithSumNaive(int[] A, int X)
    {
        int N = A.length;
        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                if (A[i] + A[j] == X)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
