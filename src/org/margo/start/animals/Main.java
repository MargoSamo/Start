package org.margo.start.animals;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setName("Vi");
        cat1.setAge(5);
        cat1.speak();

        Cat cat2 = new Cat();
        cat2.setName("Феликс");
        cat2.setAge(8);
        cat2.speak();

        Dog dog = new Dog();
        dog.setName("Baks");
        dog.age = 9;
        dog.speak();

        Bird bird = new Bird();
        bird.setNameAndAge("Воробей", 8);
        bird.speak();

        cat1.catchBird(bird);
        cat2.catchBird(bird);

        Mouse mouse = new Mouse();
        mouse.setName("Mix");
        mouse.setAge(3);
        mouse.speak();

        cat1.eatMouse(mouse);

    }

}
