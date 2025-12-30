package Java.Singleton;

public class ThreadSafeSingleton {

    // private constructor
    private ThreadSafeSingleton() {
        System.out.println("This is Thread Safe Singleton  class");
    }

    public static ThreadSafeSingleton instance;

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeSingleton tss = ThreadSafeSingleton.getInstance();
    }
}
