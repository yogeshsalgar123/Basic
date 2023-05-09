package CharityCollectionBox;

public class Currency {
	int notes;
	int coins;
	
	public Currency(int notes,int coins) 
	{
		this.notes=notes;
		this.coins=coins;
	}
	
	public int print(int n,int c) 
	{
		int res=compute(n,c);
		return res;
	}
	
	public static int compute(int notes,int coins) 
	{
		int sum=0;
		return sum;
	}
}
