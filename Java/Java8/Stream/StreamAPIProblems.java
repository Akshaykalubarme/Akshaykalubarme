package Java.Java8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamAPIProblems {
    static class Employee {
        private int id;
        private String name;
        private double salary;
        private String department;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Employee(int id, String name, double salary, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", department='" + department + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        // 1. Convert a List<Integer> to a stream and print elements
        List<Integer> list = List.of(5, 1, 3, 6, 7, 8, 4, 10, 9, 2);
        List<Integer> stream = list.stream().toList();
        // System.out.println("stream:" + stream);

        // 2. Filter even numbers from a list
        List<Integer> even = list.stream().filter(n -> n % 2 == 0).toList();
        // System.out.println("even: " + even);

        // 3.Filter odd numbers from a list
        List<Integer> odd = list.stream().filter(n -> n % 2 != 0).toList();
        // System.out.println("Odd: " + odd);

        // 4. Find numbers greater than a given value (5)
        List<Integer> numberGreaterThen = list.stream().filter(n -> n > 5).toList();
        // System.out.println("numberGreaterThen: " + numberGreaterThen);

        // 5.Count total elements in a list
        long totalCount = list.stream().count();
        // System.out.println("totalCount: " + totalCount);

        // 6. Find the first element of a stream
        Integer firstElement = list.stream().findFirst().get();
        // System.out.println("firstElement: " + firstElement);

        // 7. Find the last element of a stream
        Integer lastElement = list.stream().reduce((x, y) -> y).orElse(0);
        // System.out.println("lastElement: " + lastElement);

        // 8. Check if any number is divisible by 5
        boolean hasDivisibleBy5 = list.stream().allMatch(n -> n % 5 == 0);
        // System.out.println("hasDivisibleBy5: " + hasDivisibleBy5);

        // 9. Check if all numbers are positive
        boolean positive = list.stream().allMatch(n -> n > 0);
        // System.out.println("positive: " + positive);

        // 10. Check if none of the numbers are negative
        boolean negative = list.stream().allMatch(n -> n < 0);
        // System.out.println("negative: " + negative);

        // 11. Convert stream to array
        Object[] array = list.stream().toArray();
        // System.out.println("array: " + Arrays.toString(array));

        // 12. Convert strings to uppercase
        List<String> names = List.of("Akshay", "Sagar", "Amol", "Vishal");
        List<String> upperCase = names.stream().map(String::toUpperCase).toList();
        // System.out.println("upperCase: " + upperCase);

        // 13. Convert strings to lowercase
        List<String> lowerCase = names.stream().map(String::toLowerCase).toList();
        // System.out.println("lowerCase: " + lowerCase);

        // 14. Remove null values from a list
        List<Integer> list2 = Arrays.asList(5, 1, 3, 4, null, 10, 9, 2, null);
        List<Integer> nullValue = list2.stream().filter(Objects::nonNull).collect(Collectors.toList());
        // System.out.println("Null Values: " + nullValue);

        // 15. Square each number in a list
        List<Integer> square = list.stream().map(n -> n * n).collect(Collectors.toList());
        // System.out.println("square: " + square);

        // 16. Cube each number in a list
        List<Integer> cube = list.stream().map(n -> n * n * n).collect(Collectors.toList());
        // System.out.println("cube: " + cube);

        // 17. Add prefix to each string
        List<String> fruit = List.of("Apple", "Orange", "banana", "kiwi", "Grape", "cherry");
        List<String> prefixList = fruit.stream().map(n -> "fruit_" + n).collect(Collectors.toList());
        // System.out.println("prefixList: " + prefixList);

        // 18. Extract first character of each string
        List<String> firstCharacter = fruit.stream().map(s -> s.substring(0, 1)).collect(Collectors.toList());
        // System.out.println("firstCharacter: " + firstCharacter);

        // 19. Get length of each string
        List<Integer> length = fruit.stream().map(String::length).toList();
        // System.out.println("length: " + length);

        // 20.Convert list of integers to list of strings
        List<String> intToString = list.stream().map(String::valueOf).toList();
        // System.out.println("intToString: " + intToString);

        // 21. Filter strings starting with a specific letter
        List<String> startWithA = names.stream().filter(n -> n.startsWith("A")).toList();
        // System.out.println("startWithA: " + startWithA);

        // 22. Filter strings end with a specific letter
        List<String> endWithe = fruit.stream().filter(n -> n.endsWith("e")).toList();
        // System.out.println("endWithe: " + endWithe);

        // 23. Filter strings containing a substring
        List<String> subString = names.stream().filter(n -> n.contains("sha")).toList();
        // System.out.println("subString: " + subString);

        // 24. Multiply all numbers by 10
        List<Integer> MultiplyBy10 = list.stream().map(n -> n * 10).toList();
        // System.out.println("MultiplyBy10: " + MultiplyBy10);

        // 25.Extract salaries from employee list
        List<Employee> employees = List.of(
                new Employee(1, "Alice", 50000, "IT"),
                new Employee(2, "Bob", 70000, "Dev"),
                new Employee(3, "Charlie", 60000, "Dev"),
                new Employee(4, "Akshay", 80000, "IT"));

        List<Double> salary = employees.stream().map(Employee::getSalary).toList();
        // System.out.println("salary: " + salary);

        // 26. max salary
        OptionalDouble maxSalary = employees.stream().mapToDouble(Employee::getSalary).max();
        // System.out.println("maxSalary: " + maxSalary.orElse(0));

        // 27. min salary
        OptionalDouble minSalary = employees.stream().mapToDouble(Employee::getSalary).min();
        // System.out.println("minSalary: " + minSalary.orElse(0));

        // 28. 2nd highest salary
        OptionalDouble secondHighestSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .mapToDouble(Double::doubleValue).findFirst();
        // System.out.println("Second Highest Salary: " +
        // secondHighestSalary.orElse(0));

        // 29. Get Employees By department
        List<String> itEmployeeNames = employees.stream()
                .filter(e -> "IT".equalsIgnoreCase(e.getDepartment()))
                .map(Employee::getName)
                .toList();
        // System.out.println("By Department: " + itEmployeeNames);

        // 30. Filter employees with salary > X
        List<String> empSalaryGraterThen = employees.stream()
                .filter(n -> n.getSalary() > 70000).map(Employee::getName)
                .toList();
        // System.out.println("Emp Salary Grater Then: " + empSalaryGraterThen);

        // 31. Filter employees whose name length > 5
        List<String> lengthGraterThen5 = employees.stream().map(Employee::getName)
                .filter(e -> e.length() > 5).toList();
        // System.out.println("Length Grater Then 5: " + lengthGraterThen5);

        // 32. Sort numbers in ascending order
        List<Integer> ascOrder = list.stream().sorted().toList();
        // System.out.println("Ascending Order: " + ascOrder);

        // 33. Sort numbers in descending order
        List<Integer> descOrder = list.stream().sorted(Comparator.reverseOrder()).toList();
        // System.out.println("Descending Order: " + descOrder);

        // 34. Sort strings alphabetically
        List<String> alphabetically = names.stream().sorted().toList();
        // System.out.println("Alphabetically: " + alphabetically);

        // 35. Case-Insensitive Alphabetical Sorting
        List<String> caseInsensitive = fruit.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
        // System.out.println("Case Insensitive: " + caseInsensitive);

        // 36. Sort strings by length
        List<String> sortByLength = fruit.stream().sorted(Comparator.comparingInt(String::length)).toList();
        // System.out.println("Sort By Length: " + sortByLength);

        // 37. Sort strings by length descending
        List<String> sortByLengthDescending = fruit.stream().sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
        // System.out.println("Sort By Length Descending: " + sortByLengthDescending);

        // 38. Sort employees by salary
        List<Employee> sortBySalary = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
                .toList();
        // System.out.println("Sort By Salary: " + sortBySalary);

        // 39. Sort employees by name
        List<Employee> sortByName = employees.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        // System.out.println("Sort By name: " + sortByName);

        // 40. Find sum of all numbers
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum: " + sum);

        // 41.Find product of all numbers
        // int product = list.stream().reduce()

    }
}
