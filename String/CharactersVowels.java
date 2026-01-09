package String;

public class CharactersVowels {

    public static void main(String[] args) {

        String str = "Java";
        String vowels = "";
        String consonants = "";

        for (char i : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(i) != -1) {
                vowels += i;
            } else {
                consonants += i;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

}
