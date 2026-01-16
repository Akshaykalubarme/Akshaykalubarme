package String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        // using stream
        // boolean isAnagram = s1.chars().sorted().boxed().collect(Collectors.toList())
        // .equals(
        // s2.chars().sorted().boxed().collect(Collectors.toList()));

        // import java.util.Arrays;

        boolean isAnagram = Arrays.equals(
                s1.chars().sorted().toArray(),
                s2.chars().sorted().toArray());

        System.out.println(isAnagram);
    }

}
