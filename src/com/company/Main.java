package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("I am creating new threads...");

        ThreadGroup group = new ThreadGroup("Group");
        MyThread myThread = new MyThread();

        Thread thread1 = new Thread(group, myThread, "Thread 1");
        Thread thread2 = new Thread(group, myThread, "Thread 2");
        Thread thread3 = new Thread(group, myThread, "Thread 3");
        Thread thread4 = new Thread(group, myThread, "Thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        MyThread.sleep(15000);

        group.interrupt();
        System.out.println("I am closing all threads");

    }
}
