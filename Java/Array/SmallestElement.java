package Java.Array;

public class SmallestElement {
    public static void main(String[] args) {

        // Find smallest element in array
        // output: 1
        int[] arr = { 4, 1, 2, 3, 5, 7, 9 };
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Smallest element in array: " + min);

    }
}
