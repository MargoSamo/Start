package org.margo.start.constructor;

public class Main {

    public static void main(String[] args) {
        Rose rose = new Rose("red");
        rose.grow();
        Pion pion = new Pion(3);
        pion.grow();
        Lilia lilia = new Lilia("white", 5);
        lilia.grow();
        Basket basket = new Basket((short) 15);
        basket.setPrice(10);
        basket.putFlower(rose);
        basket.putFlower(pion);
        basket.putFlower(lilia);
        basket.putFlower(lilia);

        System.out.println(basket);

    }

}
