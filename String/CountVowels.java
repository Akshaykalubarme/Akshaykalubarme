package String;

public class CountVowels {

    public static void main(String[] args) {

        String str = "Java";
        int vowels = 0;
        int consonants = 0;

        for (char i : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(i) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

}
