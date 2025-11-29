package Java;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "John", "Sam", "Alex", "Akshay");

        // Convert to List (removing names shorter than 4 letters)
        List<String> longNames = names.stream()
                .filter(n -> n.length() >= 3)
                .collect(Collectors.toList());

        // Convert to Set (removes duplicates)
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());

        System.out.println("List: " + longNames);
        System.out.println("Set: " + uniqueNames);

    }
}
