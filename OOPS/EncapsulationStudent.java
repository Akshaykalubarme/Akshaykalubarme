package OOPS;

public class EncapsulationStudent {

    private String name;
    private int age;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be greater then 0");
        }
    }

    public static void main(String[] arg) {
        EncapsulationStudent es = new EncapsulationStudent();
        es.setName("Akshay");
        es.setAge(27);

        if (es.getAge() > 0) {
            System.out.println("Name: " + es.name);
            System.out.println("Age: " + es.age);
        }
    }

}
