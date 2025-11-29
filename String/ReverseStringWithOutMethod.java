package String;

public class ReverseStringWithOutMethod {

    public static void main(String[] args) {
        String original = "Hello Wor/ld!";
        String reverseOriginalString = reverseOriginalString(original);

        System.out.println("Reversed String: " + reverseOriginalString);
    }

    private static String reverseOriginalString(String original) {
        if (original == null || original.length() <= 1) {
            return original;
        }

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            char ch = original.charAt(i);
            if (ch != '/') { // skip '/' character
                reversed += ch;
            }
        }
        for (int i = original.length() - 1; i >= 0; i--) {
            char ch = original.charAt(i);
            if (ch == '/') {
                reversed += ' '; // Replace '/' with space
            } else {
                reversed += ch;
            }
        }
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        return reversed;
    }

}
