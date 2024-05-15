import java.util.ArrayList;
import java.util.List;

public class Practice14 
{
	public static void main(String[] args) 
	{
		int ar[] = {1,3,5,7,9,1,7,3,1,3,1,5};
		
		int count = 1;
		int j = 0;
		int i;
		List <Integer> s = new ArrayList<>();
		
		for (j=0; j<ar.length;j++)
		{
			if(s.isEmpty() || !s.contains(ar[j]))
			{
				for (i=0;i<ar.length-1; i++)
				{
					if (ar[j] == ar[i+1])
					{
						count++;
					}
				}
				
				System.out.println("Numbers repeated are " + ar[j] + " - " + count + " times");
				count = 0;	
				s.add(ar[j]);
			}
		}
	}
}
