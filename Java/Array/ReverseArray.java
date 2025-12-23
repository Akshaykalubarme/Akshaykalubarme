package Java.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        // Reverse an array
        int[] arr = { 1, 5, 3, 7, 2, 9 };

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
