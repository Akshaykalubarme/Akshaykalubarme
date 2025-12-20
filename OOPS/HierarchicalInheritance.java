package OOPS;

public class HierarchicalInheritance {

    // parent class
    public static class Animal {
        void eat() {
            System.out.println("Animal eats food!!");
        }
    }

    // child class
    public static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks..");
        }
    }

    // child class
    public static class Bird extends Animal {
        void fly() {
            System.out.println("Bird fly high");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        dog.eat();
        dog.bark();

        bird.fly();
        bird.eat();

    }
}
