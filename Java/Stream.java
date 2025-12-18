package Java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Stream {

        public static void main(String[] args) {
                List<String> names = Arrays.asList("Alex", "John", "Sam", "Alex", "Akshay", "20", "25");

                // Convert to List (removing names shorter than 4 letters)
                List<String> longNames = names.stream()
                                .filter(n -> n.length() >= 3)
                                .collect(Collectors.toList());

                int sum = names.stream().filter(n -> n.matches("\\d+"))
                                .mapToInt(Integer::parseInt).sum();

                // Convert to Set (removes duplicates)
                // Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
                List<String> longName = names.stream().distinct().collect(Collectors.toList());

                String input = "This is Java Programming";
                String result = Arrays.stream(input.split(" "))
                                .map(w -> new StringBuilder(w).reverse().toString())
                                .collect(Collectors.joining(" "));
                System.out.println("Result: " + result);

                int[] numbers = { 1, 2, 3, 4, 5, 6, 3, 4 };

                Arrays.stream(numbers)
                                .filter(n -> n % 2 != 0).skip(1)
                                .limit(1)
                                .forEach(System.out::println);

                // System.out.println("List: " + longNames);
                // System.out.println("Set: " + longName);
                // System.out.println("Sum: " + sum);

        }
}
