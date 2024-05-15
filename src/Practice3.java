

import java.util.Scanner;

public class Practice3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String you want to reverse : ");
		String str =  sc.nextLine();
		//String str1 = "Nikhil";
		//StringBuffer Revstr = "";
		System.out.println("\nString you entered is : " + str + "\n");
		//String Revstr = "";
//		char ch;
//		for(int i=0; i<str.length(); i++)
//		{
//			ch = str.charAt(i);
//			Revstr = ch + Revstr;
//		}
		
		StringBuffer sb = new StringBuffer(String.valueOf(str));
		StringBuffer Revstr = sb.reverse();
		
		System.out.println("Reverse string is : " + Revstr);
	}
}
