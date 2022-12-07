package org.margo.start.multithreading;

import java.util.concurrent.Semaphore;

public class Eleven {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);

        semaphore.acquire();
        semaphore.acquire();
        semaphore.acquire();
        System.out.println("All permits have been acquired");

        semaphore.acquire();
        System.out.println("Can't reach here .... ");
        semaphore.release();

        System.out.println(semaphore.availablePermits());

    }
}
