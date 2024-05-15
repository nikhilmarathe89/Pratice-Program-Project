
public class Practice29 extends Practice28
{
	public Practice29()
	{
		System.out.println("Inside Class 2 Constructor 1");
	}
	
	public static void main(String[] args) 
	{
		Practice28 p1 = new Practice28();
		System.out.println();
		Practice28 p2 = new Practice29();
		System.out.println();
		Practice29 p3 = new Practice29();
		//Practice29 p4 = new Practice28();
//		p1.Practice28();
//		p2.Practice28();
//		p3.Practice28();
//		p3.Practice29();
	}
}
