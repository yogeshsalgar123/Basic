package com.collection.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter id:");
		int id=sc.nextInt();
	
		System.out.println("enter enter employee name:");
	     sc.nextLine();
		String name= sc.nextLine();
		
		System.out.println("please enter age");
		int age= sc.nextInt();
		ArrayList<Emp> als = new ArrayList<Emp>();
		als.add(new Emp(id,name,age));
	}
}
