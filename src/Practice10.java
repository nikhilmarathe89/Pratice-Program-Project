

// Sum of Array - For eg. Sum of Array 5 is : 5 + 4 + 3 + 2 + 1 = 15

public class Practice10 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		
		int b = 0;
		
		for(int i = 0; i <a.length; i++)
		{
			b = b + a[i];
		}
		System.out.println("Sum of the array is " + b);
	}
}
