package com.thread.control.EvenOdd;

public class FindEvenOrOdd {

    public synchronized void odd() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
                notify();
                wait();
                notify();

            }
        }
    }
    public synchronized void even() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
                notify();
                wait();
                notify();

            }


        }
    }
}
