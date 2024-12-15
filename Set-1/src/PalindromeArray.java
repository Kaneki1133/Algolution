import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean isPalindrome = isPalindrome(numbers);

        // Display the result
        if (isPalindrome) {
            System.out.println("The array is in palindrome order.");
        } else {
            System.out.println("The array is not in palindrome order.");
        }
    }

    // Function to check if an array is a palindrome
    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false; // If any pair don't match not palindrome
            }
        }
        return true; // If all pairs match, it's a palindrome
    }
}
