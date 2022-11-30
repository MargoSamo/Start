package org.margo.start.multithreading;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThreadTwo.shutdown();

    }
}
class MyThreadTwo extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
