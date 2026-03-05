package Java.Array;

public class SumArray {
    public static void main(String[] args) {

        // Sum of even & odd numbers in array
        int[] arr = { 1, 5, 3, 4, 2 };
        int even = 0;
        int odd = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("Even sum: " + even);
        System.out.println("Odd sum: " + odd);
    }
}
