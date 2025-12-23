package Java.Array;

public class SumArray {
    public static void main(String[] args) {

        // Sum an array
        int[] arr = { 1, 5, 3, 7, 2 };
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
