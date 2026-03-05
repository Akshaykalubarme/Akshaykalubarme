package Java.Array;

import java.util.Arrays;

public class MoveAllZerosToStart {

    public static void main(String[] args) {

        int[] arr = { 0, 5, 0, 2, 4, 0 };
        int index = arr.length - 1;

        // Step 1: Move all non-zero elements to the end
        for (int i = index; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (index >= 0) {
            arr[index--] = 0;
        }

        System.out.println("Swap Method: " + Arrays.toString(arr));
    }
}
