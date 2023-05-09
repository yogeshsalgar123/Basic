package RandomPasswordGen;
import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
	public static String userInput;

	class PasswordThread extends Thread{

		String generatedPassword;

		public void run() {
			int randomNumber =(int) (Math.random()*100);
			generatedPassword =userInput+randomNumber;
			System.out.println("ThePassword is :"+generatedPassword);
		}
	}
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any Value: "); 
		userInput = sc.nextLine();

		RandomPasswordGenerator ex = new RandomPasswordGenerator();

		RandomPasswordGenerator.PasswordThread pt = ex.new PasswordThread(); 
		pt.start();
	}
}
