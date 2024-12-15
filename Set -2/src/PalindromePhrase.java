public class PalindromePhrase
{
    public static void main(String[] args)
    {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println("Is palindrome: " + isPalindrome(s1));
        System.out.println("Is palindrome: " + isPalindrome(s2));
    }

    public static boolean isPalindrome(String s)
    {

        char[] chars = s.toCharArray();
        int n = chars.length;

        char[] newChar = new char[n];
        int newCharLength = 0;


        for (int i = 0; i < n; i++)
        {
            char c = chars[i];

            if ((c >= 'A' && c <= 'Z'))
            {
                c = (char)(c + 'a' - 'A'); // Convert uppercase to lowercase
            }
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
            {
                newChar[newCharLength++] = c; // Keep alphanumeric characters
            }
        }



        // Check if the newChar Is Palindrome
        int left = 0;
        int right = newCharLength - 1;
        while (left < right)
        {
            if (newChar[left] != newChar[right])
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
