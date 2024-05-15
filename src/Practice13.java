
//Largest no. in the array

public class Practice13 
{
	public static void main(String[] args) 
	{
		int ar[] = {7,9,2,6,11};
		int sum = 0;
		
		for (int i = 0; i<ar.length; i++)
		{
			if(ar[i] > sum)
			{
				sum = ar[i];
			}
			else
			{
				sum = sum + 0;
			}
		}
		System.out.println("Largest no. in the array is : " + sum);
	}
}
