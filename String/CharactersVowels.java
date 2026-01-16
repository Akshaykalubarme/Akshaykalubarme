package String;

public class CharactersVowels {

    public static void main(String[] args) {

        String str = "Java";
        String vowels = "";

        for (char i : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(i) != -1) {
                vowels += i;
            }
        }

        System.out.println("Vowels: " + vowels);
    }

}
