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

    public void eatMouse(Mouse mouse) {
        if (mouse.getName().isEmpty() || mouse.getAge() < 0 ) {
            System.out.println("Кошка не может поймать не существующую мышку!");
        } else {
            System.out.println("Я коша " + name + " хочу поймать мышку " + mouse.getName());
        }
    }

}
