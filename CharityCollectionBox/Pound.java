package CharityCollectionBox;

public class Pound  extends Currency
{
	public Pound(int notes, int coins) 
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
		double sum=0;
		double rs1=notes*50*1.6232;
		double rs2=coins*50*1.6232;
		sum=rs1+rs2;
		int i=(int)sum;
		return i;
	}
}
