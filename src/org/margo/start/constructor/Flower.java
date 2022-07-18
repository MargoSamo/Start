package org.margo.start.constructor;

public abstract class Flower {
    String name = "цветок";
    int size;
    public Flower(String name) {
        this.name = name;
    }
    public Flower() {
    }

    public Flower(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public void grow() {
        System.out.println("Вырос " + name + " " + size);
    }

    public String toString() {
        return name;
    }
}
