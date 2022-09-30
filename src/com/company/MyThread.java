package com.company;

public class MyThread extends Thread implements Runnable {

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(3000);
                System.out.println("Hello! I am " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {

        } finally {

        }
    }
}
