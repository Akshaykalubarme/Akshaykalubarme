package String;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "programming";
        Map<Character, Integer> map = new HashMap<>();

        for (char i : str.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (char i : str.toCharArray()) {
            if (map.get(i) == 1) {
                sb.append(i);
            }
        }

        System.out.println(sb);
    }
}
