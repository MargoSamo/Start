package org.margo.start.constructor;

public class Main {

    public static void main(String[] args) {
        Rose rose = new Rose("yellow");
        rose.grow();
        Pion pion = new Pion(45);
        pion.grow();
        Basket basket = new Basket((short) 30);
        basket.setPrice(100);
        buscet.putFlower(rose);
        buscet.putFlower(pion);

        System.out.println(basket);

    }

}
