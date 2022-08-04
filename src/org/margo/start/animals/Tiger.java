package org.margo.start.animals;

public class Tiger {

    private String name;
    private int age;

    public void setName(String name) {
        if(name.isEmpty ()) {
            System.out.println("Имя ТИГРА не может быть пустым!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст ТИГРА не может быть отрицательным!");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        if (name.isEmpty() || age < 0) {
            System.out.println("Tiger doesn't exist! Enter the correct name or age");
        } else {
            System.out.println("I am a Tiger " + name + " and I can eat any of you ");
        }
    }
}
