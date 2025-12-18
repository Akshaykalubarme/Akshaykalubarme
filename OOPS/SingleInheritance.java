package OOPS;

public class SingleInheritance {

    public static class Animal {
        void eat() {
            System.out.println("Animal is eating...");
        }
    }

    public static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking!!!");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
