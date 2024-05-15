import java.util.ArrayList;
import java.util.List;

public class Practice17 
{
	public static void main(String[] args) throws InterruptedException 
	{
		int arr[]= {1,2,7,9,1,3,5,1,3,1,7};
		int count = 1;
		int i, j;
		List<Integer> l = new ArrayList<>();
		
		for(i=0; i<arr.length; i++)
		{
			if(l.isEmpty() || !l.contains(arr[i]))
			{
				for(j=0; j<arr.length-1; j++)
				{
					if(arr[i] == arr[j+1])
					{
						count++;
					}
				}
				System.out.println("The value " + arr[i] + " is repeating " + count + " times");
				count = 0;
				l.add(arr[i]);
			}
		}
	}
}
