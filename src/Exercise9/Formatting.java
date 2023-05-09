package Exercise9;

public class Formatting {
	  static String combineReverse="";
		
			private static String togetUnicode(char ch) {
			    return String.format("%d", (int) ch);
			}
			
			public static String genratePassword(String unicode)
			{
				String rev="";
				for(int i=unicode.length()-1;i>=0;i--)
				{
					rev=rev+unicode.charAt(i);
				}
				return rev;
			}
			
			public static String reduceUnicode(String combineReverse)
			{
				String com="";
				int i=Integer.parseInt(combineReverse);
		        while(i>99999)
		        {
		        	i=i/5;
		        }
				return com+i;
			}
			{
				
			}
			
			public static void main(String[] args) {
				String userName="zamil";
				
				for(int i=0;i<userName.length();i++)
				{
					String unicode=togetUnicode(userName.charAt(i));
					String rev=genratePassword(unicode);
					
					combineReverse=combineReverse+rev;
					if(combineReverse.length()>5)
						combineReverse=	reduceUnicode(combineReverse);
					
				}
				int i=Integer.parseInt(combineReverse);
				System.out.println("Octal Format: "+Integer.toOctalString(i)); 
				System.out.println("HexaDecimal Format:"+Integer.toHexString(i));  
			}
}
