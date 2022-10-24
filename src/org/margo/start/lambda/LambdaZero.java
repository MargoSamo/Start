package org.margo.start.lambda;

public class LambdaZero {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        });

        Thread thread1 = new Thread(() -> System.out.println("Hello?"));
    }
}
