package org.margo.start.multithreading;

import java.util.Random;

public class Thirteen {
    public static void main(String[] args) throws InterruptedException {
        Runner1 runner1 = new Runner1();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner1.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner1.secondThread();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner1.finished();
    }
}
class Runner1 {
    private Account account1 = new Account();
    private Account account2 = new Account();

    public void firstThread() {
        Random random = new Random();

        for(int i = 0; i < 10000; i++) {
            synchronized (account1) {
                synchronized (account2) {
                    Account.transfer(account1, account2, random.nextInt(100));
                }
            }
        }
    }

    public void secondThread() {
        Random random = new Random();

        for(int i = 0; i < 10000; i++) {
            synchronized (account1) {
                synchronized (account2) {
                    Account.transfer(account2, account1, random.nextInt(100));
                }
            }
        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance " + (account1.getBalance() + account2.getBalance()) );
    }
}

class Account {
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

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}