package com.demo.copyConstructor;

public class TestSuper {

	public TestSuper(int i) {
		System.out.println("Super Class Constructor");
	}
}

class TestSub extends TestSuper {
	public TestSub() {
		this(10); // Calling same class constructor
	}

	public TestSub(int i) {
		super(i); // Calling super class constructor
	}
}
