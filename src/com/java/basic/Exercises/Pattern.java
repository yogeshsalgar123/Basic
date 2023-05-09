package com.java.basic.Exercises;
public class Pattern {

	public static void main(String[] args)
	{
       
        int n= 3;
        
        
		int star=3;int space=1;
		for(int i=1;i<=n;i++)   //no. of lines
		{
			for(int j=1;j<=star;j++)    // no. of stars 
			{
			 System.out.print(" * ");
			
			}
			System.out.println();    // next line
			
			for(int j=1;j<=space;j++)  // no of space
			{
				System.out.print(" ");
			}
			star--;
			space++;
		}
		
	       
	}

}
