package OOPS;

interface Animal {
    void eat();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Animal is eating..");
    }
}

public class AbstractionWithInterface {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

    }

}
