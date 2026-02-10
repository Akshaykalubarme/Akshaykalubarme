package Java.Array;

import java.util.Arrays;

public class MoveAllZerosToStart {

    public static void main(String[] args) {

        int[] arr = { 0, 5, 0, 2, 4, 0 };
        int index = arr.length - 1;

        // move non-zero elements to the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }
        // fill remaining positions with 0
        while (index >= 0) {
            arr[index] = 0;
            index--;
        }

        System.out.println("Swap Method: " + Arrays.toString(arr));
    }
}
