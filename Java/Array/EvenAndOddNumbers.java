package Java.Array;

public class EvenAndOddNumbers {

    public static void main(String[] args) {
        // count even and odd numbers
        int[] arr = { 1, 2, 3, 4, 5 };
        int even = 0;
        int odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);

        // values even and odd
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
