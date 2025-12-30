package OOPS;

abstract class Vehicle {

    abstract void start();

    void fuelType() {
        System.out.println("Vehicle use fuel to start..");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is ready to start");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.start();
        c.fuelType();
    }

}
