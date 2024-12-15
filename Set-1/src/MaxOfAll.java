import java.util.Scanner;
public class MaxOfAll
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int[] number = new int[5];


        //Taking Input From User In an Array
        for (int i=0 ; i<5 ; i++)
        {
            System.out.println("Enter Number "+(i+1)+" : ");
            number[i]=myObj.nextInt();
        }

        int max = number[0];

        for (int i = 0 ; i<5 ;i++)
        {
            if (number[i] > max)
            {
                max = number[i];
            }
        }

        System.out.println(max);
    }
}
