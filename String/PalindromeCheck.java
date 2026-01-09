package String;

public class PalindromeCheck {

    public static void main(String[] args) {
        String original = "MADAM";
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println(original + ": This is palindrome");
        } else {
            System.out.println(original + ": This is not palindrome");
        }

    }
}
