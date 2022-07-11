package org.margo.start.constructor;

public abstract class Flowers {
    String name = "цветок";
    public Flowers(String name) {
        this.name = name;
    }
    public Flowers() {
    }
    public void grow() {
        System.out.println("Вырос " + name);
    }
}
