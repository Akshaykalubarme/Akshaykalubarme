package Java;

public class Singleton {

    // memory allocation only once
    public static Singleton instance;

    // private constructor
    private Singleton() {
        System.out.println("Object created successfully..");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}
