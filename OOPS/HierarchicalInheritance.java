package OOPS;

public class HierarchicalInheritance {

    public static class Animal {
        void eat() {
            System.out.println("Animal eats food!!");
        }
    }

    public static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks..");
        }
    }

    public static class Bird extends Animal {
        void fly() {
            System.out.println("Bird fly high");
        }
    }

    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.bark();
        // dog.eat();

        Bird bird = new Bird();
        bird.fly();
        bird.eat();

    }
}
