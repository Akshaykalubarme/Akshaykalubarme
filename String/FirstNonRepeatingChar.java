package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "swiss";

        Map<Character, Integer> map = new HashMap<>();
        List<Character> result = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First non repeating character: " + ch);
                // System.out.println("First non repeating character count: " + map);
                // result.add(ch);
                break;
            }
        }
        // System.out.println("First non repeating characters: " + result);

    }
}
