import java.lang.reflect.Array;
import java.util.Arrays;

/*Write a dynamic java/python/javascript program to find the Smallest and Largest value from an array? 
Input-1: 1,5,8,9,999,50,100,-1,200 
Output-1: Smallest number is: -1 
Largest number is: 999
*/


public class Practice38 
{
	public static void main(String[] args) 
	{
		int a[]= {1,5,8,9,999,50,100,-1,200};
		int b,i=0,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i] < a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("Minimum no. is " + a[0]);	}
}
