import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice20
{
    public static void main(String[] args) 
    {
    	//int num[] = {2,7,11,15};
       	int num[] = {2,7,11,0,9,15};
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the sum to get the index no. ");
    	int sum = sc.nextInt();
    	int j,c=0;
    	List<Integer> l1 = new ArrayList<>();
    	List<Integer> l2 = new ArrayList<>();
    	for(int i=0;i<num.length; i++)
    	{
    		l1.add(i);
    		c=num[i];
    	    for(j=0;j<num.length;j++)
    	    {
    	        if(num[i] + num[j]==sum)
    	        {
    	            l1.add(j);
    	            c = c + num[j];
    	        }
    	    }
    	    if(l2.isEmpty() || !l2.containsAll(l1))
    	    {
    	    	if(c==sum)
    	    	{
    	    		System.out.println(l1);
    	    		l2.addAll(l1);
    	    	}
    	    	l1.clear();
    	    	c=0;
    	    }
    	}
    }
}
