
public class Practice25 extends Practice24
{
	int a=5;
	public int method1()
	{
		System.out.println("In Class 2 and method 1");
		return a;
	}
	
	public int method2()
	{
		System.out.println("In Class 2 and method 2");
		return a;
	}
	
	
	
	public static void main(String[] args) 
	{
		Practice24 p1 = new Practice24();
		Practice24 p2 = new Practice25();
		Practice25 p3 = new Practice25();
		//Practice25 p4 = new Practice24();
		p1.method1();
		p1.method2();
		System.out.println();
		p2.method1();
		p2.method2();
		//p2.method2();
		System.out.println();
		p3.method1();
		p3.method2();
		System.out.println();
		p3.method2();
	}
}
