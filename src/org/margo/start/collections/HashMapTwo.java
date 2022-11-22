package org.margo.start.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTwo {
    public static void main(String[] args) {
        Map<String, String> translation = new HashMap<>();
        translation.put("кошка", "cat");
        translation.put("собака", "dog");
        translation.put("слон", "elephant");

        for(Map.Entry entry : translation.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
