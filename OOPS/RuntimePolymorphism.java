package OOPS;

public class RuntimePolymorphism {

    static class Vehicle {
        void start() {
            System.out.println("Vehicle is starting");
        }
    }

    static class Car extends Vehicle {
        @Override
        void start() {
            System.out.println("Car is starting");
        }
    }

    static class Bike extends Vehicle {
        @Override
        void start() {
            System.out.println("Bike is starting");
        }
    }

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start(); // Car's start()

        v = new Bike();
        v.start(); // Bike's start()
    }
}
