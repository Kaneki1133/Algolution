public class CountNegative
{
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -6};

        int count =countN(arr);
        System.out.println(count);
    }

    public static int countN(int[] a)
    {
        int count =0;
        for(int i = 0; i < a.length; i++)
        {
            if (a[i] < 0) {
                count--;
            }
        }
        return count;
    }
}

