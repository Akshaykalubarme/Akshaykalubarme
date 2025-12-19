package Java;

import java.util.concurrent.CopyOnWriteArrayList;

// A fail-safe iterator works on a copy of the collection, so it does not throw 
// exceptions if the collection is modified during iteration.
public class FailSafe {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);

        for (Integer i : list) {
            System.out.println(i);
            // list.add(3); // No exception
        }

    }
}
