package org.margo.start.animals;

public class Bird {
    String name;
    int age;

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    void speak() {
        System.out.println("Я летающая птица по имени " + name + ". Мне " + age + " лет и я умею петь.");
    }
}
