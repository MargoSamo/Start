package org.margo.start.animals;

public class Bird {
    private String name;
    private int age;

    public void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    public void speak() {
        System.out.println("Я летающая птица по имени " + name + ". Мне " + age + " лет и я умею петь.");
    }

    public String getName() {
        return name;
    }
}
