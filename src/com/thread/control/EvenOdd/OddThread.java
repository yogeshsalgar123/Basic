package com.thread.control.EvenOdd;

class OddThread extends Thread {
    FindEvenOrOdd evenOrOdd;

    public OddThread(FindEvenOrOdd evenOrOdd) {
        this.evenOrOdd = evenOrOdd;
    }

    public void run() {
        try {
            evenOrOdd.odd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}