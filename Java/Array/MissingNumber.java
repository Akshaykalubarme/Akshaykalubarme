package Java.Array;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = { 3, 2, 5, 1 };
        int n = arr.length + 1;

        // 1st approach
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i : arr) {
            actualSum += i;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number is: " + missingNumber);

        // 2nd approach - fast result
        int xor = 0;
        for (int i = 0; i <= n; i++)
            xor ^= i;
        for (int num : arr) {
            xor ^= num;
        }
        System.out.println(xor);
    }
}
