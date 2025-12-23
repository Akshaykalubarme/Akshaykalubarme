package Java.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6);

        // square number
        // numbers.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> n * n)
        // .forEach(n -> System.out.println(n));

        List<Integer> nums = List.of(1, 2, 4, 5, 6);
        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        // System.out.println(sum);

        List<Integer> number = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3, 3);

        number.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey()));

        System.out.println("--------------------");

        Set<Integer> seen = new HashSet<>();
        number.stream().filter(n -> !seen.add(n)).distinct()
                .forEach(System.out::println);
    }
}
