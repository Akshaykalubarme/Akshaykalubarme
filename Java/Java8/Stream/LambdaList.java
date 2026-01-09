package Java.Java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaList {

        public static void main(String[] args) {
                List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 3, 4);

                // numbers.stream()
                // .forEach(x -> System.out.println(x));
                // :: method reference operator
                // .forEach(System.out::println);

                long count = List.of(1, 2, 3, 4, 5).stream()
                                .filter(n -> n % 2 == 0).count();
                // System.out.println(count);

                // convert to upper case
                List<String> names = List.of("Akshay", "Vishal", "John", "Lily");
                List<String> result = names.stream()
                                .map(String::toUpperCase)
                                .toList();
                // System.out.println(result);

                // Get even numbers
                List<Integer> evenNumbers = numbers.stream()
                                .filter(n -> n % 2 == 0)
                                .toList();
                // System.out.println(evenNumbers);

                int sum = numbers.stream().reduce(0, Integer::sum);
                // System.out.println(sum);

                // highest frequency character
                String word = "mississippi";
                char hightCha = word.chars() // IntStream of character codes
                                .mapToObj(n -> (char) n) // convert to Character
                                .collect(Collectors.groupingBy(n -> n, // group by character
                                                Collectors.counting())) // count occurrences
                                .entrySet()
                                .stream()
                                .max(Map.Entry.comparingByValue()) // highest frequency
                                .get()
                                .getKey();
                // System.out.println(hightCha);

                // flatten
                List<List<Integer>> list = List.of(
                                List.of(1, 22),
                                List.of(3, 4));

                List<Integer> flat = list.stream()
                                .flatMap(n -> n.stream())
                                .sorted(Comparator.reverseOrder())
                                .toList();
                System.out.println("Flat Map:-------------" + flat);

                // remove duplicate
                List<Integer> unique = numbers.stream().distinct().toList();
                // System.out.println(unique);

                List<Integer> sort = numbers.stream()
                                .sorted().toList();
                // System.out.println(sort);

                List<String> strLists = List.of("10", "20", "abc", "xyz");
                int strList = strLists.stream()
                                .filter(s -> s.matches("\\d+"))
                                .mapToInt(Integer::parseInt)
                                .sum();
                // System.out.println(strList);

                // convert array to stream
                String name[] = { "Akshay", "Amol", "Riya", "Shiv" };

                Stream<String> stream1 = Stream.of(name);
                System.out.println("Stream:" + stream1.collect(Collectors.toList()));

                List<String> namesList = List.of("Akshay", "Amol", "Riya", "Shiv");
                // List<String> newNames = namesList.stream().filter(e ->
                // e.startsWith("A")).collect(Collectors.toList());
                List<String> newNames = namesList.stream().filter(e -> e.length() > 4).collect(Collectors.toList());
                // System.out.println(newNames);

                // square of values
                List<Integer> numbersList = List.of(4, 3, 5, 6, 10);
                List<Integer> l = new ArrayList<>(numbersList);
                l.add(12);
                System.out.println(l);
                List<Integer> numSqr = l.stream().map(e -> e * e).collect(Collectors.toList());
                System.out.println(numSqr);

                // compare two values get min value
                Integer numCompare = numbersList.stream().min((x, y) -> x.compareTo(y)).get();
                System.out.println(numCompare);

                List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                Map<Boolean, List<Integer>> result1 = list1.stream()
                                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
                System.out.println("Even:" + result1.get(true));
                System.out.println("Odd:" + result1.get(false));
        }
}
