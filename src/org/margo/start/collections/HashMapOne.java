package org.margo.start.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapOne {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map);

        map.put(3, "Another value for key three");

        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.get(10));
    }
}
