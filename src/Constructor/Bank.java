package Constructor;

public class Bank {

	int amount=500;
	
	Bank()
	{
		System.out.println(amount);
	}
	
	Bank(int a)
	{
		a=this.amount+a;
		System.out.println(a); //600
	}
	
	
	public static void main(String[] args) {
		Bank b1 =new Bank();
		Bank b2 = new Bank(100);
	}

}
