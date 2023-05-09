package com.java.basic.Exercises;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner ns=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=ns.nextInt();

		boolean res=checkPalindrome(num);
		if(res==true)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not a Palindrome");

		System.out.println("--------------------------------------------------");

		checkPrime(num);
		ns.close();
	}

	static boolean checkPalindrome(int num)  //121  212 101  555
	{
		int temp=num;

		int reverse=0;
		while(num!=0)
		{
			int rem=num%10;   
			reverse=(reverse*10)+rem;
			num/=10;   
		}
		if(reverse==temp)
			return true;
		else
			return false;
	}

	static void checkPrime(int num)   //num/1 && num/num == 0(rem)
	{
		int temp=num;
		boolean isPrime=true;
		for(int i=2;i<=temp/2;i++)
		{
			if(temp%2==0)
				isPrime=false;
			break;
		}
		if(isPrime==true) 
		{
			System.out.println("Number is Prime: "+temp+"p");
		}
		else {
			System.out.println("Number is not a Prime");
		}
	}
}
