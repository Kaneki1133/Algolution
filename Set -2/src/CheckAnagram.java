public class CheckAnagram
{
    public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

        str1 = "gram";
        str2 = "arm";

        if (isAnagram(str1, str2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < s1.length(); i++)
        {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }

        for (int count : charCount)
        {
            if (count != 0)
            {
                return false;
            }
        }

        return true;
    }
}
