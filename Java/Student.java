package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;

    }

    // Natural ordering: by ID
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Akshay", 85));
        students.add(new Student(1, "Amol", 90));
        students.add(new Student(2, "Riya", 75));

        // Sorting using Comparable (Natural Order)
        System.out.println("Sorting by ID (Comparable):");
        Collections.sort(students);
        students.forEach(System.out::println);

        // Sorting using Comparator (by Marks)
        System.out.println("\nSorting by Marks (Comparator):");
        Collections.sort(students, (s1, s2) -> s1.marks - s2.marks);
        students.forEach(System.out::println);
    }
}
