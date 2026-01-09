package String;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String args[]) {

        // First Approach
        String str = "Java";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

        // Second Approach:
        String original = "FullStack";
        Map<Character, Long> output = original.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(output);
    }
}
