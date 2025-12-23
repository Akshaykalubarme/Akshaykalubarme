package Java.Array;

public class LargestElement {

    public static void main(String[] args) {

        // Find the Largest Element in an Array
        // output: 9

        int[] arr = { 1, 2, 5, 7, 9, 3 };

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element in array: " + max);

    }

}
