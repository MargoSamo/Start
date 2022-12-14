package org.margo.start.annotation;

public class One {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Hello from main thread");

        MyClass myClass = new MyClass();
        myClass.myMethod();

    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello from MyThread");

    }
}
