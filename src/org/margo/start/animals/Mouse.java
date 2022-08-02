package org.margo.start.animals;

public class Mouse {

    private String name;
    private int age;

    public void setName(String name) {
        if(name.isEmpty ()) {
            System.out.println("Имя не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Вoзраст должен быть больше нуля");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("Я мышка по имени " + name + ". Мне " + age + " лет и я умею говорить.");
    }

}
