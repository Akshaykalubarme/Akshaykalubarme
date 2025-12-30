package OOPS;

public class CompileTimePolymorphism {

    // Compile time polymorphism (Method Overloading) occurs when multiple methods
    // of same name but different parameters/
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism ctp = new CompileTimePolymorphism();
        System.out.println(ctp.add(10, 20));
        System.out.println(ctp.add(25, 10, 20, 40));
        System.out.println(ctp.add(2, 10, 2, 4));
    }

}
