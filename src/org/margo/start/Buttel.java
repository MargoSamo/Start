package org.margo.start;

public class Buttel {
    public static void main(String args[]) {
        int beerNum = 99;
        String word = "бутылок (бутылки)";

        while (beerNum>0){
            if (beerNum==1) {
                word = "бутылка"; //В единственном числе
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum == 0) {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}