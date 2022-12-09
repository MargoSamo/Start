package org.margo.start.multithreading;

import java.util.Random;
import java.util.concurrent.*;

public class Sixteen {
    private static int result;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        /*executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finished");
        });*/

        /*executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Finished");
                result++;
            }
        });
        executorService.shutdown();

        *//*try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*//*

        System.out.println(result);*/

        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            Thread.sleep(500);
            System.out.println("Finished");

            Random random = new Random();
            int randomValue = random.nextInt();

            if(randomValue < 5)
                throw  new Exception("Something bad happened");

            return random.nextInt(10);
        });
        executorService.shutdown();

        try {
            int result = future.get();
            System.out.println(result  );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
