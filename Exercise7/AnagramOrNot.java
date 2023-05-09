package Exercise7;

import java.util.Scanner;

public class AnagramOrNot {
	public static void main(String[] args)
	{
		Scanner ns = new Scanner(System.in);
		System.out.print("Enter the First String: ");
		String s1=ns.nextLine();
		System.out.print("Enter the Second String: ");
		String s2=ns.nextLine();
		
		boolean rs=isAnagarm(s1,s2);
		if(rs==true)
			System.out.println("String is an Anagram");
		else
			System.out.println("String is not an Anagram");
		
		ns.close();
	} 
	
	static boolean isAnagarm(String str1, String str2)
	{
		int c1[]=countFreq(str1);
		int c2[]=countFreq(str2);
		for(int i=0;i<26;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}

	static int[] countFreq(String str)
	{
		int count[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}return count;
	}
}
