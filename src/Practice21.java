import java.util.ArrayList;
import java.util.List;

public class Practice21 
{
	public static void main(String[] args) 
	{
		int a;
		int c, f=0;
		for(int i=1000;i<9999;i++)
		{
			a=i;
			List<Integer> l = new ArrayList<>();
			while(a>0)
			{
				c=a%10; //0 0 0 1
				l.add(c); // 0 0 0 1
				a=a/10;
			}
			
			Integer b[]=new Integer[l.size()];
			l.toArray(b);
			//System.out.println(Arrays.toString(b));
			
			for(int j=0;j<b.length;j++)
			{
				f=f+b[j];
			}
			//System.out.println(f);
			if(f==10)
			{
				System.out.println(i);
			}
			f=0;
		}
	}
}
