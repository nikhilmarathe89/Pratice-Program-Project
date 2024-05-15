import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Write a dynamic java program to validate the given String is a valid IPV4 address or not? 
 
Input1: 255.255.255.255 
Output1: 255.255.255.255 is a valid IPV4 address 
 
Input2: 0.0.0.0 
Output2: 0.0.0.0 is a valid IPV4 address 
 
Input3: 255.255.256.255 
Output3: 255.255.256.255 is NOT a valid IPV4 address 
 
Input4: 1.2.3.4.5 
Output4: 1.2.3.4.5 is NOT a valid IPV4 address
*/

public class Practice37 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int count=0;
		String s2[] = s1.split("\\.");
		for(String s3:s2)
		{
			int value = Integer.parseInt(s3);
			for(int i=0;i<value;i++)
			{
				if(value>=1 && value<=255)
				{
					System.out.println(value);
					count++;
				}
				value=0;
			}
		}
		if(count==4)
		{
			System.out.println("IP address is valid");
		}
		else
		{
			System.out.println("IP address is not valid");
		}
	}
}
