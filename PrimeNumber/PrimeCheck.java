package PrimeNumber;

public class PrimeCheck {

    public static void main(String[] args) {
        int number = 17;

        if (isPrimeNumber(number)) {
            System.out.println(number + " is prime number.");
        } else {
            System.out.println(number + " not is prime number.");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
