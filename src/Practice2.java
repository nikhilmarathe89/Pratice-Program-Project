//Star pattern

import java.util.Scanner;

public class Practice2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the line of stars you want to create : ");  
		int a= sc.nextInt(); 
		
		for(int i = 0; i<=a; i++)
		{			
			for(int j=a; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
