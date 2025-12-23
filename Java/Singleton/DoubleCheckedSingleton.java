package Java.Singleton;

public class DoubleCheckedSingleton {

    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
        System.out.println("This is Double Checked Singleton class");
    }

    public static DoubleCheckedSingleton getInstance() {
        // first check
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                // second check
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DoubleCheckedSingleton dsl = DoubleCheckedSingleton.getInstance();
    }
}
