package Java.Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        // even
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> evens = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        // System.out.println(evens);

        // start with 1
        List<Integer> list1 = Arrays.asList(10, 15, 19, 20, 11);
        List<String> result = list1.stream().map(String::valueOf)
                .filter(n -> n.startsWith("1")).collect(Collectors.toList());
        // System.out.println(result);

        // remove duplicates
        List<Integer> list3 = Arrays.asList(1, 2, 3, 2, 4, 5, 3);
        List<Integer> duplicates = list3.stream()
                .distinct().collect(Collectors.toList());
        // System.out.println();

        // find first element
        list3.stream().findFirst().ifPresent(System.out::println);

    }
}
