package Java.Java8.Stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductCompanyInterviews {

    public static void main(String[] args) {

        // Q1) Convert List to Uppercase
        List<String> names = List.of("akshay", "rohit", "virat");
        List<String> upperCase = names.stream().map(String::toUpperCase).toList();
        // System.out.println(upperCase);

        // Q2) Filter Even Numbers
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> even = nums.stream().filter(n -> n % 2 == 0).toList();
        // System.out.println(even);

        // Q3) Sum of Numbers
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        // System.out.println(sum);

        // Q4) Count Strings Starting With "A"
        List<String> names1 = List.of("Akshay", "Amit", "Rohit");
        List<String> startWith = names1.stream().filter(n -> n.startsWith("A")).toList();
        // System.out.println(startWith);

        // Q5) Find Maximum Number
        Optional<Integer> max = nums.stream()
                .max(Integer::compareTo);
        // System.out.println(max.orElse(0));

        // Q6) Remove Duplicates
        List<Integer> nums1 = List.of(1, 2, 2, 3, 4, 4);
        List<Integer> duIntegers = nums1.stream().distinct().toList();
        // System.out.println(duIntegers);

        // Q9) Find Second Highest Number
        List<Integer> nums2 = List.of(10, 20, 30, 40, 50);
        Integer secondHighest = nums2.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        // System.out.println(secondHighest);

        // Q10) Find First Non-Repeated Character
        String str = "aabbcdde";
        Character ch = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        // System.out.println(ch);

        // Q11) Frequency of Each Word
        List<String> words = List.of("apple", "banana", "apple");
        Map<String, Long> freq = words.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(freq);
    }
}
