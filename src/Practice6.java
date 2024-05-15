//Remove space from string

public class Practice6 
{
	public static void main(String[] args) 
	{
		String str = "This  string<contains  many(spaces#%and  Special^characters";
		
		System.out.println("Original String is : " + str);
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		str = str.replaceAll("\\s\\s", " ");
		System.out.println("New String is : " + str);
	}
}
