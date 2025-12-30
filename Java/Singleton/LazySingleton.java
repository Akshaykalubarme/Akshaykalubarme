package Java.Singleton;

public class LazySingleton {

    // private constructor
    private LazySingleton() {
        System.out.println("This is Lazy Singleton  class");
    }

    public static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton ls = LazySingleton.getInstance();
    }
}
