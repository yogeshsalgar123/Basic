package com.java.basic.Exercises;

import java.util.Scanner;

public class ConditionalOperator 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double totalretail=0;
		while(true)
		{
			System.out.println("1-product A,22.50 rupees");
			System.out.println("2-product B,44.50 rupees");
			System.out.println("3-product C,9.98 rupees");
			System.out.println("4-exit program");
			System.out.print("enter product no:");
			int prodno=sc.nextInt();

			if(prodno==4)
			{
				break;

			}
			System.out.print("enter quantity sold:");
			int quantitysold=sc.nextInt();
			switch(prodno)
			{
			case 1:
				totalretail+=22.50*quantitysold;
				break;
			case 2:
				totalretail+=44.50*quantitysold;
				break;
			case 3:
				totalretail+=9.98*quantitysold;
				break;
			}
			System.out.println("\nthe total retail value all product sold:$"+totalretail);
		}
	}

}