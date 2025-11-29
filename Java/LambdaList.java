package Java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaList {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "John", "Sam");

        // Optional Class
        Optional<String> name = Optional.of("Akshay");
        name.ifPresent(System.out::println);

        System.out.println("---------------------");

        // map to uppercase
        names.stream().map(String::toUpperCase)
                .forEach(n -> System.out.println(n));
    }
}
