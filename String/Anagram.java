package String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        // System.out.println(Arrays.equals(a1, a2));

        // using stream
        boolean isAnagram = s1.chars().sorted().boxed().collect(Collectors.toList())
                .equals(
                        s2.chars().sorted().boxed().collect(Collectors.toList()));

        System.out.println(isAnagram);
    }

}
