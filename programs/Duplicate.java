package programs;

public class Duplicate {
	public static void main(String[] args) {
		String str = "salgarehenn bb";
		int count = 0;
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i + 1; j < str.length(); j++) 
			{
				if (ch[i] == ch[j])
				{
					System.out.println(ch[j]);
					count++;
					break;
				}
			}
		}
	}

}
