package org.margo.start.constructor;

public class Main {

    public static void main(String[] args) {
        Rose rose = new Rose("yellow");
        rose.grow();
        Pion pion = new Pion(45);
        pion.grow();
        Basket basket = new Basket((short) 30);

    }

}
