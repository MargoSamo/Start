package org.margo.start.animals;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Vi", 5);
        cat1.speak();

        Cat cat2 = new Cat("Феликс", 8);
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

        Tiger tiger = new Tiger();
        tiger.setName("Frosiy");
        tiger.setAge(-1);
        tiger.speak();

       /* Fox fox = new Fox();
        fox.setName("Лиса");*/

    }

}
