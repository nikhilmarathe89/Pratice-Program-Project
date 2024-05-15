import Screenshots.Interface1;
import Screenshots.Interface2;

public class Practice32 implements Interface1, Interface2
{
		public static void main(String[] args) 
		{
			Practice32 p32 = new Practice32();
	        p32.setImgs("XYZ");
	    }
		@Override
		public String setImgs(String a) 
		{
			System.out.println("Inside class Practice32");
			return "this is the car";
		}
}
