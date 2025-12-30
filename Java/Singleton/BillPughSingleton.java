package Java.Singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("This is Bill Pugh Singleton  class");
    }

    private static class Helper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Helper.instance;
    }

    public static void main(String[] args) {
        BillPughSingleton bps = BillPughSingleton.getInstance();

    }
}
