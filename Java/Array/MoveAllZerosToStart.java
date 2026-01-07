package Java.Array;

import java.util.Arrays;

public class MoveAllZerosToStart {

    public static void main(String[] args) {

        int[] arr = { 0, 5, 0, 2, 4, 7 };
        int j = arr.length - 1;
        for (int i = j; i >= 0; i--) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("Swap Method: " + Arrays.toString(arr));
    }
}
