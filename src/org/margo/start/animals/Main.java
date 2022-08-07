package org.margo.start.animals;

public class Main {

    public static void main(String[] args) {

        int[] nam = new int[5];
        nam[0] = 20;
        System.out.println(nam[0]);

        String[] strings = {"Привет ", "новый ", "массив "};
        for (String s: strings) {
            System.out.print(s);
        }
        System.out.println();

        int[] namber = {1, 5, 7, 8};
            int sum = 0;
            for (int x: namber) {
                sum = sum + x;
            }
            System.out.println(sum);

            System.out.println();



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

        Fox fox = new Fox("Лиса", 6);
        fox.speak();


    }

}
