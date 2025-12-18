package Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamProblems {

    public static void main(String[] args) {

        Integer lists[] = { 10, 20, 50, 30, 50 };
        List<Integer> secondHight = Arrays.asList(lists);
        secondHight.stream().sorted(Comparator.reverseOrder()).skip(1)
                .forEach(System.out::println);

        // Remove duplicates and sort the list
        Integer list[] = { 5, 1, 2, 5, 3, 1 };
        List<Integer> intList = Arrays.asList(list);
        intList.stream().distinct().sorted();
        // forEach(System.out::println);

    }
}
