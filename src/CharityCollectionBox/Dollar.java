package CharityCollectionBox;

public class Dollar  extends Currency
{
	public Dollar(int notes, int coins)
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
		int rs1=notes*50;
		int rs2=coins*50;
		sum=rs1+rs2;
		return sum;
	}
}
