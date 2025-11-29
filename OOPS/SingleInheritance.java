package OOPS;

public class SingleInheritance {

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

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
