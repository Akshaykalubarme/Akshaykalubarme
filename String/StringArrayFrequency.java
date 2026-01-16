package String;

import java.util.HashMap;

public class StringArrayFrequency {
    public static void main(String args[]) {

        String[] str = { "Java", "Python", "React", "java", "SQL" };

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : str) {
            s = s.toLowerCase();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.println(map);

    }
}
