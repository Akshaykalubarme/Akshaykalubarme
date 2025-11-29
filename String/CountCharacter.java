package String;

public class CountCharacter {

    public static void main(String[] args) {
        String input = "Hello World!";
        char target = 'l';
        int count = countOccurrences(input, target);

        System.out.println("Character " + target + " occurred " + count + " times.");
    }

    private static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
