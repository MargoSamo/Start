package org.margo.start.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOne {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Anna");
        hashSet.add("Boris");
        hashSet.add("Tania");
        hashSet.add("Sveta");
        hashSet.add("Sveta");
        hashSet.add("Vova");
        hashSet.add("Vova");

        for(String name : hashSet) {
            System.out.println(name);
        }
        System.out.println(hashSet.contains("Vova"));
        System.out.println(hashSet.contains("Nana"));
        System.out.println(hashSet.isEmpty());

        System.out.println(hashSet);

        System.out.println();

        linkedHashSet.add("Anna");
        linkedHashSet.add("Boris");
        linkedHashSet.add("Tania");
        linkedHashSet.add("Sveta");
        linkedHashSet.add("Vova");

        for(String name : linkedHashSet) {
            System.out.println(name);
        }
        System.out.println();

        treeSet.add("Anna");
        treeSet.add("Boris");
        treeSet.add("Tania");
        treeSet.add("Sveta");
        treeSet.add("Vova");

        for(String name : treeSet) {
            System.out.println(name);
        }

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        Set<Integer> union =new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);


    }
}
