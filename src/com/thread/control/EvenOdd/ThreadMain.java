package com.thread.control.EvenOdd;

public class ThreadMain {

	public static void main(String[] args) {
		FindEvenOrOdd fe = new FindEvenOrOdd();
		EvenThread1 et = new EvenThread1(fe);
		et.start();
		OddThread od = new OddThread(fe);
		od.start();
	}
}
