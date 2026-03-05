package Java.Java8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStream {
    private int empId;
    private String name;
    private String department;
    private double salary;

    public EmployeeStream(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EmployeeStream{" +
                "id='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        List<EmployeeStream> employees = Arrays.asList(
                new EmployeeStream(1, "Akash", "IT", 50000.7),
                new EmployeeStream(2, "Bob", "HR", 70000),
                new EmployeeStream(3, "Don", "IT", 60000),
                new EmployeeStream(4, "John", "Finance", 70000.1),
                new EmployeeStream(5, "Akshay", "IT", 80000.5));

        // Find All Employees Working in IT Department
        List<EmployeeStream> itDepart = employees.stream().filter(e -> e.getDepartment().equals("IT")).toList();
        // itDepart.forEach(System.out::println);

        // Find All Employees with Salary > 60000
        List<EmployeeStream> highestSalary = employees.stream().filter(e -> e.getSalary() > 60000)
                .toList();
        // highestSalary.forEach(System.out::println);

        // Get List of Employee Names
        List<String> names = employees.stream().map(EmployeeStream::getName).toList();
        // names.forEach(System.out::println);

        // Find Average Salary
        double averageSalary = employees.stream().mapToDouble(EmployeeStream::getSalary).average().orElse(0.0);
        // System.out.println(averageSalary);

        // Find Highest Salary Employee
        EmployeeStream highestSalary1 = employees.stream()
                .max(Comparator.comparing(EmployeeStream::getSalary)).orElse(null);
        // System.out.println(highestSalary1);

        // Find Second Highest Salary
        EmployeeStream secondHighestSalary = employees.stream()
                .sorted(Comparator.comparing(EmployeeStream::getSalary).reversed())
                .skip(1).findFirst().orElse(null);
        // System.out.println(secondHighestSalary);

        Optional<Double> sH = employees.stream()
                .map(EmployeeStream::getSalary).distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();
        // sH.ifPresent(System.out::println);

        // Count Employees in Each Department
        Map<String, Integer> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(EmployeeStream::getDepartment,
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
        // System.out.println(employeesByDept);

        // Group Employees by Department
        Map<String, List<EmployeeStream>> result = employees.stream()
                .collect(Collectors.groupingBy(EmployeeStream::getDepartment));

        System.out.println(result);

    }
}
