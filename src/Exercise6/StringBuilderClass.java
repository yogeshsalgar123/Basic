package Exercise6;

public class StringBuilderClass {
	public static void main(String[] args) 
	{
		String[] names= {"Yogesh "," Abhiranjan "," Snehal "," Ankesh "," Raksha "," Ravi "," Sai "," Teja "," Amey "," Shubham "};
     

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < names.length; i++)
		{
			sb.append(names[i]);
		}
		String str = sb.toString();
		System.out.println(str);
	
}

}
