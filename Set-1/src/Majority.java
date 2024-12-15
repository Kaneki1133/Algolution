public class Majority
{
    public static void main(String[] args)
    {
        int[] a = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        int app = 0;

        int count = 0;

        int n = a.length / 2;

        majorityElement(a,n);

        int result = findMajority(a,n);
        System.out.println(result);



    }


    public static void majorityElement(int a[],int n)
    {
        int max = 0;
        for (int i = 0 ; i<a.length ; i++)
        {
            int count = 0;
            for (int j = 0 ; j<a.length ; j++)
            {
                if (a[i] == a[j])
                {
                    count++;
                }
            }
            if(count>=n)
            {
                System.out.println(a[i]);
                break;
            }
        }
    }






    public static int findMajority(int a[],int n)
    {
        int count = 0;
        int i = 0;
        while (count > n)
        {
            if (a[i] == i)
            {
                count++;
            }
            i++;
        }

        return count;

    }

}



