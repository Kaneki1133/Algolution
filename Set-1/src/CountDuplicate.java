public class CountDuplicate
{
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 4, 7, 8, 6};
        int count = 0;


        for (int i = 0; i < array.length; i++)
        {

            boolean isDuplicate = false;

                    for (int j = 0; j < i; j++)
                    {
                        if (array[i] == array[j])
                        {
                            isDuplicate = true;
                            break;
                        }
                    }

            if (!isDuplicate)
            {
                for (int k = i + 1; k < array.length; k++)
                {
                    if (array[i] == array[k]) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println("Total number of duplicate numbers: " + count);
    }
}
