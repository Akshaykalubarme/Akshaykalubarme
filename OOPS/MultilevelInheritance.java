package OOPS;

public class MultilevelInheritance {

    public static class Animal {
        void eat() {
            System.out.println("Animal eats food");
        }
    }

    public static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

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
