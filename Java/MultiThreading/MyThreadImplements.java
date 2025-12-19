package Java.MultiThreading;

public class MyThreadImplements implements Runnable {

    public void run() {
        System.out.println("Thread implements runnable..");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyThreadImplements());
        t.start();
    }
}
