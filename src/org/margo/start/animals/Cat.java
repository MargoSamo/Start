package org.margo.start.animals;

public class Cat {

    String name;
    int age;

    void setName(String userName) {
        name = userName;
    }

    void speak() {
        System.out.println("Я кошка. Меня зовут " + name + ", мне " + age + " лет." );
    }

}
