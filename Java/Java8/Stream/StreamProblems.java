package Java.Java8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamProblems {

    public static void main(String[] args) {

        // Q1. Convert List to Stream
        List<String> list = List.of("A", "B", "C");
        // list.stream().forEach(System.out::println);

        // Q2. Stream of Array
        int[] arr = { 1, 2, 3, 4, 5 };
        // Arrays.stream(arr).forEach(System.out::println);

        // Q3. filter() even numbers
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> even = nums.stream().filter(a -> a % 2 == 0).toList();
        // System.out.println("Even Numbers: " + even);

        // Q4. Strings starting with "A"
        List<String> names = List.of("Akshay", "Amol", "Shiv", "Riya", "Aditya");
        List<String> startWithA = names.stream().filter(n -> n.startsWith("A")).toList();
        // System.out.println("Start With A: " + startWithA);

        // Q5. map()
        List<Integer> squareNumbers = nums.stream().map(n -> n * n).toList();
        // System.out.println("Square Numbers:" + squareNumbers);

        // Q6. Convert names to uppercase
        List<String> upperCase = names.stream().map(String::toUpperCase).toList();
        // System.out.println("Upper Case:" + upperCase);

        // Q7. Flatten list of lists
        List<List<Integer>> list2 = List.of(List.of(10, 20, 30), List.of(60, 50, 40));
        List<Integer> flatList = list2.stream().flatMap(List::stream).toList();
        // System.out.println("flatList: " + flatList);

        // Q8. Split sentences into words
        List<String> lines = List.of("Hello World", "Java Stream");
        List<String> words = lines.stream().flatMap(s -> Arrays.stream(s.split(" "))).toList();
        // System.out.println(words);

        // Q 9. distinct() Remove duplicates
        List<Integer> unique = List.of(1, 3, 2, 4, 5, 4, 2, 1);
        List<Integer> uniques = unique.stream().distinct().toList();
        // System.out.println("Uniques: " + uniques);

        // Q10. Sort ascending
        List<Integer> ascending = unique.stream().distinct().sorted().toList();
        // System.out.println("Ascending Order: " + ascending);

        // Q11. Sort descending
        List<Integer> descending = unique.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        // System.out.println("Descending Order: " + descending);

        // Q12. limit()
        // first 3 elements
        List<Integer> first3 = unique.stream().distinct().limit(3).toList();
        // System.out.println("First Three elements: " + first3);

        // Q13. skip()
        // skip first 2 elements
        List<Integer> skip = unique.stream().distinct().skip(2).toList();
        // System.out.println("Skip 2 elements: " + skip);

        // Q14. sum()
        // sum of elements
        int sum = unique.stream().distinct().reduce(0, Integer::sum);
        // System.out.println("Sum: " + sum);

        // Q15. max()
        Optional<Integer> max = unique.stream().distinct().reduce(Integer::max);
        // System.out.println("Max: " + max);

        // Q16. findFirst() & findAny()
        Optional<Integer> first = nums.stream().findFirst();
        System.out.println("first: " + first.orElse(0));

        Optional<Integer> any = nums.stream().findAny();
        System.out.println("Find Any: " + any);

    }
}
