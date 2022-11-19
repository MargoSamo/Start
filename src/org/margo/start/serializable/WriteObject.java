package org.margo.start.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        /*Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");*/
        Person[] people = {new Person(1, "Bob"),
                            new Person(2, "Mike"),
                            new Person(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

           /* oos.writeObject(person1);  // var 1
            oos.writeObject(person2);*/

            /*oos.writeInt(people.length); // var 2 запись в массив поочередно

            for(Person person : people) {
                oos.writeObject(person);
            }*/

            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
