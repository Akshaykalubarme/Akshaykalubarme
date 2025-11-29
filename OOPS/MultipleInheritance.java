package OOPS;

public class MultipleInheritance {

    public interface Car {
        void showCar();
    }

    public interface Bike {
        void showBike();
    }

    public static class Showroom implements Car, Bike {

        @Override
        public void showCar() {
            System.out.println("My favorite lamborghini Car");
        }

        @Override
        public void showBike() {
            System.out.println("I Love ZX 10R Bike");
        }

    }

    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        showroom.showCar();
        showroom.showBike();
    }
}
