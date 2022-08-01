package org.margo.start.animals;

public class Cat {

    private String name;
    private int age;

    public void setName(String userName) {
        name = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("Я кошка. Меня зовут " + name + ", мне " + age + " лет." );
    }

    public void catchBird(Bird bird) {
        System.out.println("Кошка " + name + " поймала птицу " + bird.getName());
        }

}
