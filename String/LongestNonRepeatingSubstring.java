package String;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {

        String s = "abcdabcbb";
        Set<Character> set = new HashSet<>();
        int max = 0;

        for (int i = 0, j = 0; j < s.length(); j++) {

            // If duplicate found, remove from left
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }

            set.add(s.charAt(j));
            max = Math.max(max, j - i + 1);
        }

        // actual substring abc
        int startIndex = 0;

        for (int i = 0, j = 0; j < s.length(); j++) {

            // Remove duplicates from left
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }

            set.add(s.charAt(j));

            // Update max length and start index
            if (j - i + 1 > max) {
                max = j - i + 1;
                startIndex = i;
            }
        }

        System.out.println("Longest substring: "
                + s.substring(startIndex, startIndex + max));
        System.out.println("Length: " + max);
    }
}
