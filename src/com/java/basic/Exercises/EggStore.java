package com.java.basic.Exercises;

import java.util.Scanner;

public class EggStore {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total number of eggs: ");
		int n=sc.nextInt();
		calculateEggCount(n);
	}
	  static void calculateEggCount(int count)
		{
			if(count>=144)
			{
				int gross=count/144;
				System.out.println(count);
				
				
				int x=count%100;
				System.out.println(x);
				
				int dz=x/12;
				System.out.println(dz);
				
				int rem=x%12;
				System.out.println(rem);
				
				System.out.println("Your Total number of eggs is "+gross+"-gross, "+""+dz+"-dozen, and "+rem+" eggs remaining");
			}
			else if(count>=12)
			{
				int dz=count/12;
				int rem=count%12;
				System.out.println(dz+" dozen, and "+rem);
			}
			else
			{
				System.out.println(count+" remaining");
			}
		}
}
