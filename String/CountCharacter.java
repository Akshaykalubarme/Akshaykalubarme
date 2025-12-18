package String;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {
        String input = "Akshay";

        // for loop and map
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toLowerCase().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // System.out.println(map);
        // ----------------------------------------------------------------
        // stream api
        Map<Character, Long> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // System.out.println(result);
        // ----------------------------------------------------------------
        char target = 'a';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        // System.out.println(target + ": " + count);
        // ----------------------------------------------------------------

    }
}
