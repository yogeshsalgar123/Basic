package CharityCollectionBox;

public class Rupee extends Currency
{
	public Rupee(int notes, int coins)
	{
		super(notes, coins);
	}
	
	public int print(int n,int c) 
	{
		int res=compute(n,c);
		return res;
	}
	
	public static int compute(int notes,int coins) 
	{
		int sum=0;
		int rs1=notes*5;       //Its based on 5 Rupee
		int rs2=coins*5;
		sum=rs1+rs2;
		return sum;
	}
}
