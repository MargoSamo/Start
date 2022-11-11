package org.margo.start.morning;

public class Main {
    public static void main(String[] args) {

        Mouse mouse = new Mouse("Mouse1", 2);
        Cat cat = new Cat("Cat1", 5);

        cat.eatMouse(mouse);
    }
}
