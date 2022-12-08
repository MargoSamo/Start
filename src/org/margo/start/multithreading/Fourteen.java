package org.margo.start.multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fourteen {
    public static void main(String[] args) throws InterruptedException {
        Runner2 runner2 = new Runner2();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner2.firstThread();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner2.secondThread();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner2.finished();
    }
}

class Runner2 {
    private Base base1 = new Base();
    private Base base2 = new Base();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLocks(Lock lock1, Lock lock2) throws InterruptedException {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }

                if (firstLockTaken) {
                    lock1.unlock();
                }

                if (secondLockTaken) {
                    lock2.unlock();
                }
            }
            Thread.sleep(1);
        }
    }

    public void firstThread() throws InterruptedException {
        Random random = new Random();

        for(int i = 0; i < 10000; i++) {
            takeLocks(lock1, lock2);
            try {
                Base.transfer(base1, base2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() throws InterruptedException {
        Random random = new Random();

        for(int i = 0; i < 10000; i++) {
           takeLocks(lock2, lock1);
            try {
                Base.transfer(base2, base1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println(base1.getBalance());
        System.out.println(base2.getBalance());
        System.out.println("Total balance " + (base1.getBalance() + base2.getBalance()) );
    }
}

class Base {
    private int balance = 10000;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Base acc1, Base acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}