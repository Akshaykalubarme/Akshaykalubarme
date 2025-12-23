package Java.Array;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };
        int index = 0;

        // Move non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
