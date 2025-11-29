package LeetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s1 = "Hello World ";
        int len = lengthOfLastWord(s1);
        System.out.println("Length of last word in \"" + s1 + "\" is: " + len);
    }

    public static int lengthOfLastWord(String s1) {

        String trimmed = s1.trim();
        int lastSpaceIndex = trimmed.lastIndexOf(" ");
        String lastWord = trimmed.substring(lastSpaceIndex + 1);

        return lastWord.length();

    }
}
