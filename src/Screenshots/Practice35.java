package Screenshots;

public class Practice35 implements  Interface3, Interface4
{
	public String setImgs(String a)
    {
        return "In Class";
    }
	public static void main(String[] args) {
        Practice35 p35 = new Practice35();
        System.out.println(p35.setImgs("XYZ"));
    }
	
}
