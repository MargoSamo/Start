package org.margo.start.collections;

import java.util.*;

public class ComparatorOne {
    public static void main(String[] args) {
        List<Human> people = new ArrayList<>();

        people.add(new Human(1, "Max"));
        people.add(new Human(2, "Bax"));
        people.add(new Human(3, "Anna"));

        Collections.sort(people, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if(o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(people);

        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("dogonetwo");
        animals.add("cat");
        animals.add("frog");
        animals.add("ad");
        animals.add("bird");
        animals.add("a");

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(animals);

        List<Integer> number = new ArrayList<>();

        number.add(5);
        number.add(500);
        number.add(0);
        number.add(100);

        Collections.sort(number, (o1, o2) -> {
            if(o1 > o2) {
                return -1;
            } else if (o1 < o2) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(number);
    }
}

/*class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}*/

/*
class BackwardIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}*/

class Human {
    private int id;
    private String name;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}