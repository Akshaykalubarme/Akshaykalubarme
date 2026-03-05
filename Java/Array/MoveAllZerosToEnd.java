package Java.Array;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };

        // First Approach: Two pointer
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

        // // Second Approach: Swap Method (In-Place)
        int[] arr2 = { 0, 5, 0, 2, 4, 7 };
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
                j++;
            }
        }
        System.out.println("Swap Method" + Arrays.toString(arr));

    }
}
