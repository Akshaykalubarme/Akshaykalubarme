package Java.Java8.Stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Add {
    int sum(int x, int y);

}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        Add a = (x, y) -> x + y;
        System.out.println(a.sum(10, 20));

        Supplier<String> random = () -> "Java Coding";
        System.out.println(random.get());

        Consumer<String> print = s -> System.out.println(s);
        print.accept("Akshay");

        Predicate<Integer> p = n -> n % 2 == 0;
        System.out.println(p.test(10));

        Function<String, Integer> name = f -> f.length();
        System.out.println(name.apply("Java Stream"));

    }
}
