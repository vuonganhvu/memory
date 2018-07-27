package com.higgsup.memory.synchronization;

public class DeadLockThread {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[]) {
        Thread T1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2s...");
                }
            }
        });
        Thread T2 = new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 1...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 2: Waiting for lock 2...");

                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2s...");
                }
            }
        });
        T1.start();
        T2.start();
    }
}
