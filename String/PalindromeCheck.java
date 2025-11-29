package String;

public class PalindromeCheck {

    public static void main(String[] args) {
        String original = "MADAM";

        if (isPalindrome(original)) {
            System.out.println(original + " is Palindrome");
        } else {
            System.out.println(original + " is Not Palindrome");
        }

        // System.out.println(
        // original.equalsIgnoreCase(new StringBuilder(original).reverse().toString()) ?
        // "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindrome(String original) {
        int left = 0;
        int right = original.length() - 1;

        while (left < right) {
            if (original.charAt(left) != original.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

}
