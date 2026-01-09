package Java.Java8.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamList {
        public static void main(String[] args) {

                List<Integer> numbers = List.of(1, 2, 4, 5, 3, 5, 4);

                // filter()
                numbers.stream()
                                .filter(x -> x % 2 == 0)
                                .collect(Collectors.toList())
                                .forEach(System.out::println);
                System.out.println("--------------------------");

                // numbers.stream().map((x, y) -> x)

                // remove duplicate
                numbers.stream().distinct()
                                .collect(Collectors.toList())
                                .forEach(System.out::println);
                System.out.println("--------------------------");

                // square of each number
                numbers.stream()
                                .map(n -> n * n)
                                .toList()
                                .forEach(System.out::println);
                System.out.println("--------------------------");

                // Get start with A
                List<String> names = List.of("Akshay", "Amit", "Raj", "Anil");
                names.stream()
                                .filter(n -> n.startsWith("A"))
                                .collect(Collectors.toList())
                                .forEach(System.out::println);
                System.out.println("--------------------------");

                // To upper case
                names.stream()
                                .map(String::toUpperCase)
                                .collect(Collectors.toList())
                                .forEach(System.out::println);
                System.out.println("--------------------------");

                // flat map
                List<List<Integer>> list = List.of(
                                List.of(1, 2),
                                List.of(3, 4));
                list.stream().flatMap(List::stream)
                                .collect(Collectors.toList())
                                .forEach(System.out::println);
                System.out.println("--------------------------");

        }
}
