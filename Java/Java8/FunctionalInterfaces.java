package Java.Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Add {
    int sum(int a, int b);
}

public class FunctionalInterfaces {

    public static void main(String[] args) {
        Add a = (x, y) -> x + y;
        System.out.println(a.sum(10, 20));

        // Built-in Functional Interfaces
        // Supplier: Don't take input but return value
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());

        // Consumer: Consume input but don't return
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Akshay");

        // Predicate: Check conditions and return boolean
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10));

        // Function: Takes T and return R
        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("Akshay"));

    }
}
