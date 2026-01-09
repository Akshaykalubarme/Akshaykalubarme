package Java.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {

        // Reverse an array
        int[] arr = { 1, 5, 3, 7, 2, 9 };
        int[] arr2 = { 1, 5, 3, 7, 2, 9 };
        int[] arr3 = { 10, 50, 33, 77, 52, 98 };

        // First Approach:
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));

        // Second Approach:
        reverse(arr, 0, arr.length - 1);

        // Third Approach: Reverse Array with XOR
        int left = 0, right = arr2.length - 1;
        while (left < right) {
            arr2[left] ^= arr2[right];
            arr2[right] ^= arr2[left];
            arr2[left] ^= arr2[right];

            left++;
            right--;
        }

        System.out.println("Reverse with XOR:" + Arrays.toString(arr2));

        // Fourth Approach: Using Stream
        int[] reverse = IntStream.range(0, arr3.length - 1)
                .map(n -> arr3[arr3.length - 1 - n]).toArray();
        System.out.println("Reverse with Stream:" + Arrays.toString(reverse));

    }

    private static void reverse(int[] arr, int start, int end) {

        // stop when pointers cross
        if (start > end) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        // swaps elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverse(arr, start + 1, end - 1);
    }
}
