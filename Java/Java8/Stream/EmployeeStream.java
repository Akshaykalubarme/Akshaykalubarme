package Java.Java8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeStream {
    private String empId;
    private String name;
    private double salary;

    public EmployeeStream(String empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        List<EmployeeStream> employees = Arrays.asList(
                new EmployeeStream("Emp1", "A", 50000),
                new EmployeeStream("Emp2", "A", 70000),
                new EmployeeStream("Emp3", "A", 60000),
                new EmployeeStream("Emp4", "A", 70000),
                new EmployeeStream("Emp4", "A", 80000));

        // Optional<Double> shs = employees.stream().map(EmployeeStream::getSalary)
        // .distinct().sorted(Comparator.reverseOrder())
        // .skip(1).findFirst();

        // System.out.println(shs.orElse(0.0));
        int n = 3;
        Optional<Double> salary = findNthHighestSalary(employees, n);
        System.out.println(salary.orElse(0.0));
    }

    public static Optional<Double> findNthHighestSalary(List<EmployeeStream> employees, int n) {
        return employees.stream().map(EmployeeStream::getSalary)
                .distinct().sorted(Comparator.reverseOrder())
                .skip(n - 1).findFirst();
    }
}
