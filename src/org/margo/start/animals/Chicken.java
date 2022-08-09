package org.margo.start.animals;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name entered incorrectly!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
     }

     public void setAge(int age) {
        if (age < 0 ) {
            System.out.println("Age entered incorrectly!");
        }
        this.age = age;
     }

     public int getAge() {
        return age;
     }

     public void speak() {
        if (name.isEmpty() || age < 0 ) {
            System.out.println("Chicken out of stock!");
        }
        System.out.println("Age " + age + " " + name + " - it's a chicken");
     }
}
