package Exercise2;

import java.util.Scanner;
import java.util.Stack;

public class StackPushPop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		System.out.print("Enter the array size: ");
		
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) 
		{
			stack.push(i);
		}
		
		System.out.println("Stack before pop: "+stack);
		System.out.println("Removing the last element through pop");
		System.out.println("Element which will be poped: "+stack.pop());
		System.out.println("Stack after pop: "+stack);
	
     }

}
