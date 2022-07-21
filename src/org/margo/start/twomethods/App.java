package org.margo.start.twomethods;

public class App {

    int i;

    int j;

    public static void main (String[] args) {
        App t = new App();
        t.go();
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
   /*    public static void gogo() {
        System.out.println("It works!");
    }

    public static void main(String[] args) {
        App.gogo();
    }*/
}

