import java.util.Arrays;
import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        int[] num = new int[7];



        // Input From Users
        for (int i = 0; i <= 6; i++) {
            System.out.println("Enter The Number " + (i + 1) + ": ");
            num[i] = myobj.nextInt();
        }
        System.out.println("The Original String is :");
        System.out.println(Arrays.toString(num));


        System.out.println("The Reverse String is ");
        for (int i = num.length-1; i>=0 ;i--) {
                System.out.print(num[i] + " ");
            }
    }

}