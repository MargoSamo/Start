package org.margo.start.animals;

public class Dog {
    String name;
    int age;

    void setName(String userName) {
        name = userName;
    }

    void speak() {
        System.out.println("Я собака по имени " + name + " и я умею говорить Гав. Мой возраст " + age + " лет.");
    }
}
