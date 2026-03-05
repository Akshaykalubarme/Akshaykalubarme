package OOPS;

interface Permission {
}

class Employee implements Permission {
    int id = 101;
    String name = "Akshay";
}

public class MarkerInterface {

    public static void main(String[] args) {
        Employee emp = new Employee();
        if (emp instanceof Permission) {
            System.out.println("Permission Granted");
        } else {
            System.out.println("Permission Not Granted");
        }

    }
}
