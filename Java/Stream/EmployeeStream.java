package Java.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeStream {
    private String empId;
    private String name;

    public EmployeeStream(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        List<EmployeeStream> employees = Arrays.asList(
                new EmployeeStream("E001", "Akshay"),
                new EmployeeStream("E002", "Rahul"),
                new EmployeeStream("E003", "Sneha"),
                new EmployeeStream("E004", "Priya"),
                new EmployeeStream("E005", "Manish"));

        List<String> empIds = employees.stream()
                .map(EmployeeStream::getEmpId)
                .collect(Collectors.toList());

        // System.out.println(empIds);

        // simple runnable example
        Runnable r = () -> System.out.println("Hello, Lambda!");
        // new Thread(r).start();

        // Iterating list
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "JavaScript", "Python");
        // list.forEach(System.out::println);

        // filtering list
        List<String> filteredList = list.stream()
                .filter(n -> n.startsWith("J"))
                .collect(Collectors.toList());
        // filteredList.forEach(System.out::println);

        // sorting list
        list.sort((a, b) -> a.compareTo(b));
        // list.forEach(System.out::println);

        // lambda expresion with map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring Boot");
        map.put(4, "React Js");
        map.put(3, "Python");
        // map.forEach((key, value) -> System.out.println(key + ": " + value));
        // Map<Integer, String> sortedMap = new TreeMap<>(map);

        // sort reverse
        Map<Integer, String> sortedMap = new TreeMap<>(Collections.reverseOrder());

        sortedMap.putAll(map);
        System.out.println(sortedMap);
    }
}
