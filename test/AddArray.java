package com.test;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		
		//to create array of size 
		int arr[]=new int[size];
		
		System.out.println("enter the numbers in array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i : arr) {
			sum=sum+i;
		}
		System.out.println("sum of array="+sum);
	  */
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("sum of array is="+sum);
	} 
} 
