package com.higgsup.memory.synchronization;

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        ClassB classB1 = new ClassB();
        ClassA classA1 = new ClassA();
        Thread thread = new Thread(() -> classB1.printLn(classA1));
        Thread thread2 = new Thread(() -> classB1.printLn(classA1));
        Thread thread3 = new Thread(() -> classB1.printLn(classA1));
        thread.start();
        thread2.start();
        thread3.start();
        Thread.sleep(1);
        classA1.printLn();
    }
}

class ClassB {
    void printLn(ClassA a) {
        synchronized (ClassA.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println(String.format("Synchronized has thread name is %s i= %d...", Thread.currentThread().getName(), i));
            }
        }
    }
}

class ClassA {
    synchronized void printLn() {
        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("A has thread name is %s i= %d...", Thread.currentThread().getName(), i));
        }
    }
}
