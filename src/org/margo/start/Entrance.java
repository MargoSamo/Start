package org.margo.start;

public class Entrance {
    int key;


    void gate() {
        if (key > 60) {
            System.out.println("Вход через дверь");
        } else if (key > 14) {
            System.out.println("Вход через окно");
        }else {
            System.out.println("Еду к маме");
                }
            }
        }



class EntranceTestDrive {
    public static void main (String[] args) {
     Entrance one = new Entrance();
     one.key = 70;
     Entrance two = new Entrance();
     two.key = 50;
     Entrance three = new Entrance();
     three.key = 5;

     one.gate();
     two.gate();
     three.gate();
    }
}

