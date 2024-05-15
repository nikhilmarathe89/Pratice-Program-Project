// Fibonacci series

public class Practice5 
{
	public static void main(String[] args) 
	{
		System.out.println("Below is the fibonaccci series : ");
		
		int i=0,j = 1;
		
		System.out.print( i + " " +j);
		
		for(int k=i; k<30; k++)
		{
			k = i + j;
			System.out.print(" " + k);
			i = j;
			j = k;
		}
	}
}
