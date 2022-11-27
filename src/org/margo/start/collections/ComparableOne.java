package org.margo.start.collections;

import java.util.*;

public class ComparableOne {
    public static void main(String[] args) {
        List<Man> manList = new ArrayList<>();
        Set<Man> manSet = new TreeSet<>();

        addElement(manList);
        addElement(manSet);

        Collections.sort(manList);

        System.out.println(manList);
        System.out.println(manSet);
    }

    private static void addElement(Collection collection) {
        collection.add(new Man(4, "To"));
        collection.add(new Man(1, "F"));
        collection.add(new Man(3, "Den"));
        collection.add(new Man(2, "Weel Smit"));

    }
}

class Man implements Comparable<Man> {
    private int id;
    private String name;

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return id == man.id && Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /*@Override
    public int compareTo(Man o) {
        if(this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
            return 0;
        }*/

    @Override
    public int compareTo(Man o) {
        if(this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
