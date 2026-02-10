package String;

import java.util.HashSet;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {

        String original = "abcabcbb";

        HashSet<Character> set = new HashSet<>();
        String longest = "";
        String current = "";

        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);

            if (set.contains(ch)) {
                set.clear();
                current = "";
            }

            set.add(ch);
            current += ch;

            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println("Longest sub string is: " + longest);
    }
}
