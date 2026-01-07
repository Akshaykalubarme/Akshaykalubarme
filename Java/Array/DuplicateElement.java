package Java.Array;

import java.util.HashSet;

public class DuplicateElement {

    public static void main(String[] args) {

        // remove duplicate elements
        int[] arr = { 1, 2, 1, 5, 3, 5 };
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
            }
        }
        System.out.println(set);
    }
}
