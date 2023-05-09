package com.thread.control.EvenOdd;

class EvenThread1 extends Thread {


    FindEvenOrOdd evenOrOdd;

    public EvenThread1(FindEvenOrOdd evenOrOdd) {

        this.evenOrOdd = evenOrOdd;
    }

    public void run() {
        try {
            evenOrOdd.even();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}