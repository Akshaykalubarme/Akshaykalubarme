package String;

import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        // using stream
        boolean isAnagram = s1.chars().sorted().boxed().collect(Collectors.toList())
                .equals(
                        s2.chars().sorted().boxed().collect(Collectors.toList()));

        System.out.println(isAnagram);
    }

}
