package org.margo.start.constructor;

public class Basket {

    int volume;
    String name;
    Flower[] flowers = new Flower [10];

    public void add() {
        for (int i =0; i < 10; i++) {
           Rose rose = new Rose("green");
           flowers[i] = rose;
        }
    }
    public void present() {

    }
    public void collect() {

    }
    void find() {

    }
    void discover() {

    }
    public void see() {

    }
    public void meet() {

    }
    public void hit() {

    }
    public void love() {

    }
    public void favorite() {

    }


}
