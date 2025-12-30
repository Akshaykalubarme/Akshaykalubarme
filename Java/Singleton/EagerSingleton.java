package Java.Singleton;

public class EagerSingleton {

    // private constructor
    private EagerSingleton() {
        System.out.println("This is Eager Singleton class");
    }

    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {

    }

}
