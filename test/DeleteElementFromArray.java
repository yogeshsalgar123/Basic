package com.test;

public class DeleteElementFromArray 
{
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int element=30;
		
		for(int i=0;i<arr.length;i++)
		{
			if(element==arr[i])
			{
				for(int j=i;j<arr.length-1;i++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
}
