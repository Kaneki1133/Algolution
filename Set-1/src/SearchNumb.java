import java.util.Scanner;

public class SearchNumb
{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.println("Enter the number to search:");
        int target = scanner.nextInt();


        int index = -1;
        for (int i = 0; i < n; i++)
        {
            if (array[i] == target)
            {
                index = i;
                break;
            }
        }

        System.out.println("Index of the first occurrence: " + index);
    }
}
