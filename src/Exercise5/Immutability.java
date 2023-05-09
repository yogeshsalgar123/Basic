package Exercise5;

public class Immutability {
	public static void main(String[] args) 
	{

		String str="The quick fox jumps over the lazy dog";
		String str2="The quick brown fox jumps over the lazy dog";
		String str3="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

		System.out.println("--------------------All Operations-----------------------");
		System.out.println();
		char c=str.charAt(12);
		System.out.println("1. Character at the 12th Index in String str is: "+c);
		System.out.println();

		System.out.println("2. Does String str contains the word [is]: "+str.contains("is"));
		System.out.println();

		String str1=" and killed it";
		System.out.println("3) Addition of String: "+str.concat(str1));
		System.out.println();

		System.out.println("4) Does String str ends with dogs: "+str.endsWith("dogs"));
		System.out.println();

		System.out.println("5) Does String str2 is same as String str: "+str.equals(str2));
		System.out.println();

		System.out.println("6) Does String str3 is same as String str: "+str.equals(str3));
		System.out.println();

		System.out.println("7) Total Length of the String str: "+str.length());
		System.out.println();

		System.out.println("8) Does String str matches with String str3: "+str.matches(str3));
		System.out.println();

		System.out.println("9) Replace the word [The] in String str with [A]: "+str.replace("The","A"));
		System.out.println();

		System.out.println("10) Split the above String where no 2 animal names comes together: ");
		String[] res=str.split(" jumps ");
		for(int i=0;i<res.length;i++)
		{
			System.out.println("["+res[i]+"]");
		}
		System.out.println();

		System.out.println("12) Print the String str2 in Upper case: "+str2.toUpperCase());
		System.out.println();

		System.out.println("13) Print the String str3 in Lower case: "+str3.toLowerCase());
		System.out.println();

		System.out.println("14) Find the index position of character [a]: "+str.indexOf("a"));
		System.out.println();

		System.out.println("15) Find the last index position of character [e] in String str: "+str.lastIndexOf("e"));
		System.out.println("16) Find the last index position of character [e] in String str: "+str2.lastIndexOf("e"));
	
}
}
