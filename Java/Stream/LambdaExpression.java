package Java.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {

    @FunctionalInterface
    public interface MathOperation {
        int operate(int a, int b);

    }

    public static void main(String[] args) {
        // add operation
        MathOperation add = (a, b) -> a + b;
        int sum = add.operate(10, 20);

        // subtract operation
        MathOperation subtract = (a, b) -> a - b;

        // Lambda for multiplication (with block)
        MathOperation multiply = (a, b) -> {
            int result = a * b;
            return result;
        };

        // Lambda for division
        MathOperation divide = (a, b) -> b == 0 ? 0 : a / b;

        System.out.println(sum);
        System.out.println("Add 10 + 5 = " + add.operate(10, 5));
        System.out.println("Sub 10 - 5 = " + subtract.operate(10, 5));
        System.out.println("Multiply 10 * 5 = " + multiply.operate(10, 5));
        System.out.println("Divide 10 / 5 = " + divide.operate(10, 5));

        // second highest number
        Integer[] numbers = { 3, 10, 5, 2 };

        List<Integer> numList = Arrays.asList(numbers);
        int secondHightest = numList.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHightest);
    }
}
