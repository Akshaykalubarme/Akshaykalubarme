package Java.MultiThreading;

public class MyThreadExtends extends Thread {

    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        MyThreadExtends t = new MyThreadExtends();
        t.start();
    }
}
