package com.java.stack;

import java.util.Stack;

public class PostFix {
	Stack<String> stack = new Stack<>();
	public static void main(String[]args)
	{
		PostFix programm = new PostFix();
		programm.start();
	}
	public void start()
	{
		//     Scanner ip = new Scanner(System.in);
		//     System.out.println("Please enter Post fix Expression:\n");
		//     String exp = ip.nextLine();
		String exp="6523+8*+3+";
		evaluate(exp);
		System.out.println("\nResult of Post Fix Expression is : "+stack.peek());
	}

	public void evaluate(String exp)
	{
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)!='+'&&exp.charAt(i)!='-'&&exp.charAt(i)!='*'&&exp.charAt(i)!='/')
			{
				char c = exp.charAt(i);
				String s = Character.toString(c);
				stack.push(s);
			}
			else
			{
				operation(exp.charAt(i));
			}
		}
	}
	
	public void operation(char o)
	{
		int a = Integer.parseInt(stack.pop());
		int b = Integer.parseInt(stack.pop());
		String t;
		switch(o)
		{
		case '+':
			t = String.valueOf(a+b);
			stack.push(t);
			break;
		case '-':
			t = String.valueOf(a-b);
			stack.push(t);
			break;
		case '*':
			t = String.valueOf(a*b);
			stack.push(t);
			break;
		case '/':
			t = String.valueOf(a/b);
			stack.push(t);
			break;
		}
	}
}
