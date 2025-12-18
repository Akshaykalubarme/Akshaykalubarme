package Java;

public class Singleton {

    // double-checked locked
    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("Only one instance is created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // bill pugh
    // private Singleton() {
    // System.out.println("Only one instance is created");
    // }

    // public static class InnerSingleton {
    // private static final Singleton instance = new Singleton();
    // }

    // public static Singleton getInstance() {
    // return InnerSingleton.instance;
    // }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
    }

}
