package com.java.string.basic;

public class StringPoolExample {

	public static void main(String[] args) {
		
		String s1 = "abc";     //  in string pool created 
		String s2 = new String("abc"); // in heap area created 
		
		String s3 = "abc";           // pointed to same value already present in string pool
		String s4 = new String("abc"); //new object is created 
		
		String s5="def";  //new literal is created if not present in string pool
		String s6=new String("abc").intern(); //it will check if value is present in string if present it will point to that refernce otherwise it will store in string pool
		
		System.out.println(s1 +" "+s2+" "+s3+" "+s4+" "+s5+" "+s6);
		

		System.out.println(s1==s6);   // true
		System.out.println(s1==s2);   // false
		System.out.println(s1.equals(s2)); //true
	}

}
