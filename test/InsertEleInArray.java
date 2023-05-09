package com.test;

public class InsertEleInArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int position=3;
		int element=100;
		
		for(int i=arr.length-1;i>position-1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[position-1]=100;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
		}
	}
}
