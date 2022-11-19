package org.margo.start.enumtest;

public class Test {
    public static void main(String[] args) {

        Season winter = Season.WINTER;
        System.out.println("Порядковый номер энама " + winter.ordinal());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog);

        Animal animal = Animal.DOG;
        System.out.println(animal);

        switch (animal) {
            case CAT:
                System.out.println("It's a cat!");
                break;
            case DOG:
                System.out.println("It's a dog!");
                break;
        }

        Season season = Season.WINTER;
        System.out.println(season.name());
        System.out.println(season.getTemperature());

        switch (season) {
            case AUTUMN:
                System.out.println("Osen");
                break;
            case SPRING:
                System.out.println("Vesna");
                break;
            case SUMMER:
                System.out.println("Leto");
                break;
            default:
                System.out.println("Zima");
        }
    }
}
