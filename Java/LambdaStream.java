package Java;

import java.util.Arrays;
import java.util.List;

public class LambdaStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6);

        // square number
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(n -> System.out.println(n));

        System.out.println("---------------------");

        // filter data
        List<Integer> number = Arrays.asList(10, 20, 5, 30, 60);
        number.stream()
                .filter(n -> n >= 10)
                .forEach(n -> System.out.println(n));

        System.out.println("---------------------");

        List<Integer> nums = Arrays.asList(1, 2, 4, 5, 6);
        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

    }
}
