package PasswordThread;
import java.util.Random;
import java.util.Scanner;
public class Exercise3 {
	public static String userInput;

	class PasswordThread implements Runnable{
		String generatedPassword;
		Thread t;
		public PasswordThread() {
			t=new Thread(this);
		}
		@Override
		public void run() {
			int RandomNumber=(int)(Math.random()*100);
			generatedPassword = userInput+RandomNumber;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		userInput=sc.nextLine();
		
		Exercise3 ex=new Exercise3();
		Exercise3.PasswordThread pt = ex.new PasswordThread();
		
		pt.t.start();
	}

}
