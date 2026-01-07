package Java.Array;

public class SumArray {
    public static void main(String[] args) {

        // Sum of even numbers in array
        int[] arr = { 1, 5, 3, 7, 2 };
        int sum = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
