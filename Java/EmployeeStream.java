package Java;

import java.util.Arrays;
import java.util.List;
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

        System.out.println(empIds);
    }
}
