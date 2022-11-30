package org.margo.start.multithreading;

public class One {
    public static void main(String[] args) throws InterruptedException {
       /* MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();*/

        /*System.out.println("Hello from main thread");*/

        /*System.out.println("I am going to sleep");
        Thread.sleep(3000);
        System.out.println("I am awake!");*/

        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Hello from main thread");
    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 15; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}
