package String;

public class ReverseString {

    public static void main(String[] args) {

        String original = "Akshay!";

        // for loop
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println(reverse);

        // remove !!
        for (int i = original.length() - 1; i >= 0; i--) {
            char c = original.charAt(i);
            if (c != '!') {
                reverse += c;
            }
        }
        System.out.println(reverse);

        // substring
        String subString = "sha";
        if (original.contains(subString.toLowerCase())) {
            System.out.println("This is sub string");
        } else {
            System.out.println("This is not sub string");
        }

    }

}
