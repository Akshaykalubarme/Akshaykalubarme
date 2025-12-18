package Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeyAndValue {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Banana");
        map.put(2, "Apple");
        map.put(3, "Mango");

        // Sort Map by Key (Ascending) Tree Map
        Map<Integer, String> sortedByTreeMap = new TreeMap<>(map);
        // System.out.println(sortedByTreeMap);

        // Sort Map by Key (Descending)
        Map<Integer, String> sortedByDescending = new TreeMap<>(Collections.reverseOrder());
        sortedByDescending.putAll(map);
        // System.out.println(sortedByDescending);

        // Sort Map by Value (Ascending)
        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<Integer, String> sortedMapByValue = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMapByValue.put(entry.getKey(), entry.getValue());
        }
        // System.out.println(sortedMapByValue);

        // Sort Map by Value (Descending)
        List<Map.Entry<Integer, String>> list2 = new ArrayList<>(map.entrySet());
        list2.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        Map<Integer, String> sortedMapByValueD = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list2) {
            sortedMapByValueD.put(entry.getKey(), entry.getValue());
        }
        // System.out.println(sortedMapByValueD);

        // Get Value by Key
        String value = map.get(1);
        System.out.println(value);

        // Get All Values from Map
        Collection<String> values = map.values();
        System.out.println(values);

        // using stream
        map.values()
                .stream()
                .forEach(System.out::println);
    }
}
