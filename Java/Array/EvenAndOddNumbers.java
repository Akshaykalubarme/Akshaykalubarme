package Java.Array;

public class EvenAndOddNumbers {

    public static void main(String[] args) {
        // even and odd numbers
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.print("Even Numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd Numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
