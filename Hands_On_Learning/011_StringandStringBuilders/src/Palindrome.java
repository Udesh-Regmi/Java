public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome of String");

        String str = "abcdecba";  // Change this to test different cases
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        // Compare characters from both ends moving towards the center
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);  // From beginning
            char end = str.charAt(str.length() - 1 - i);  // From end.

            if (start != end) {
                return false;  // If mismatch found, not a palindrome
            }
        }
        return true;  // All matched
    }
}
