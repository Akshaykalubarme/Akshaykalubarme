package OOPS;

public class MultilevelInheritance {

    // parent class
    public static class Animal {
        void eat() {
            System.out.println("Animal eats food");
        }
    }

    // child for Animal and parent for Bird class
    public static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    // child class
    public static class Bird extends Dog {
        void fly() {
            System.out.println("Bird fly high");
        }
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.bark();
        bird.fly();
    }

}
