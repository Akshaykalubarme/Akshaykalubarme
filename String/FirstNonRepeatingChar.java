package String;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "Akshay";

        Set<Character> unique = new HashSet<>();
        for (char ch : str.toCharArray()) {
            unique.add(ch);

        }
        System.out.println(unique);
        // --------------------------------------------------------------
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                // System.out.println("First non repeating character: " + ch);
                break;
            }
        }

    }
}
