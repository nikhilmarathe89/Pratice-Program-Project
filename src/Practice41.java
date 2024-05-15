import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class Practice41 
{
	public static void main(String[] args) 
	{
		//Approach 1 - Random
		Random ran = new Random();
		int no1 = ran.nextInt(100);
		System.out.println(no1);

		double doub = ran.nextDouble(); // range 0.0 and less than 1.0
		System.out.println(doub);
		
		//Approach 2 - Math
		System.out.println(Math.random()); // will print double value
		
		//Approach 3 - Apache commons-lang API
		//https://commoons.apache.org/
		String no2 = RandomStringUtils.randomNumeric(5);
		System.out.println(no2);
		
		String str = RandomStringUtils.randomAlphabetic(5);
		System.out.println(str);
	}
}
