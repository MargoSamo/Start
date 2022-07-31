package org.margo.start.animals;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setName("Vi");
        cat1.age = 5;
        cat1.speak();


        Cat cat2 = new Cat();
        cat2.name = "Феликс";
        cat2.age = 8;
        cat2.speak();

        Dog dog = new Dog();
        dog.setName("Baks");
        dog.age = 9;
        dog.speak();

        Bird bird = new Bird();
        bird.setNameAndAge("Воробей", 8);
        bird.speak();

    }

}
