package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        Iterator<Integer> lt = list.iterator();
        while (lt.hasNext()) {
            System.out.println(lt.next());
            // list.add(30); // ConcurrentModificationException
        }
    }
}
