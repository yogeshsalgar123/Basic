package com.java.basic.Exercises;

import java.util.Scanner;

public class IncomeTaxSlab {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter g for General tax slab & w for Women in 2011 and 2012: ");
		char ch=sc.next().charAt(0);

		
		System.out.print("Enter the year  >>>> ");
		int year=sc.nextInt();
		
		double tax;
		if(ch=='g') 
		{
			if(year!=2011 || year!=2012)
			{
				System.out.print("Enter the Income: ");
			}

			int income=sc.nextInt();

			if(income>=0 && income<=180000) 
			{
				System.out.println("No Tax");
			}
			else if(income>=180001 && income<=500000) 
			{
				tax=income*0.10;
				System.out.println("Tax is 10% :- "+tax);		
			}
			else if(income>=500001 && income<=800000) 
			{
				tax=income*0.20;
				System.out.println("Tax is 20% :-"+tax);	
			}
			else if(income>=800000) 
			{
				tax=income*0.30;
				System.out.println("Tax is 30% :- "+tax);	
			}
		}
		else if(ch=='w') 
		{
			if( year==2011 || year==2012)
				System.out.print("Enter the Income: ");

			int inc=sc.nextInt();

			if(inc>=0 && inc<=190000)
			{

				System.out.println("No Tax ");
			}
			else if(inc>=190001 && inc<=500000) 
			{
				tax=inc*0.10;
				System.out.println("Tax is 10% :- "+tax);		
			}
			else if(inc>=500001 && inc<=800000) 
			{
				tax=inc*0.20;
				System.out.println("Tax is 20% :- "+tax);	
			}
			else if(inc>=800000)
			{
				tax=inc*0.30;
				System.out.println("Tax is 30% :- "+tax);	
			}
		}
		else
		{
			System.out.println("enter the valid character !!!");
		}
	}
}


