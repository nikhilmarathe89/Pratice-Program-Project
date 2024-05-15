//Replace Special characters without replace method 

public class Practice11 
{
	public static void main(String[] args) 
	{
		String str= "Pr!ogr#am%m*in&g Lan?#guag(e";
		
		String ch = "";
		
		System.out.println("Original String is \nPr!ogr#am%m*in&g Lan?#guag(e");
		
		for (int i = 0; i<str.length(); i++)
		{
			
			
			if(str.charAt(i) > 64 && str.charAt(i) <= 122)
			{
				ch = ch + str.charAt(i);
			}
		}
		System.out.println("\nModified String is \n" + ch);
	}
}
