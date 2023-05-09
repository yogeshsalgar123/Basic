package com.java.string.basic;

public class Test {
	int i;

	Test(int i)

	{
		this.i = i;
	}

	public int hashCode() {
		return 1;
	}

	public String tostring()

	{
		return i + "";
	}

	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = new Test(100);
		System.out.println(t1); //Test@1
		System.out.println(t2); //Test@1
		System.out.println(t1.i); //10
		System.out.println(t2.i); //100
		System.out.println(t1.hashCode()); // 1
		System.out.println(t1.toString()); //Test@1
		System.out.println(t2.hashCode()); // 1
		System.out.println(t2.toString()); //Test@1
		
	}

}
