package OOPS;

public class MultilevelInheritance {

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

    public static class Bird extends Dog {
        void fly() {
            System.out.println("Bird fly high");
        }
    }

    public static void main(String[] args) {
        // Animal an = new Animal();
        // an.eat();

        // Dog dog = new Dog();
        // dog.eat();
        // dog.bark();

        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        bird.bark();
    }

}
