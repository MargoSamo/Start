package org.margo.start.constructor;

public abstract class Flower {
    String name = "цветок";
    public Flower(String name) {
        this.name = name;
    }
    public Flower() {
    }
    public void grow() {
        System.out.println("Вырос " + name);
    }

    public String toString() {
        return name;
    }
}
