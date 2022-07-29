package org.margo.start.animals;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        //cat1.name = "Вася";
        cat1.setName("Vi");
        cat1.age = 5;
        cat1.speak();
        //System.out.println("Я кот " + cat1.name + ", мне " + cat1.age + " лет." );

        Cat cat2 = new Cat();
        cat2.name = "Феликс";
        cat2.age = 2;
        cat2.speak();
        //System.out.println("Я кот " + cat2.name + ", мне " + cat2.age + " года." );

    }

}
