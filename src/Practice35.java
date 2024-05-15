import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Practice35 
{
	public static void main(String[] args) 
	{
		String s1 = "this is the sampl text";
		String s2= "";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int count = 0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(i) == s1.charAt(j) && s1.charAt(i) != ' ')
				{
					count++;
				}
			}
			map.put(s1.charAt(i), count);
			count = 0;
		}
		System.out.println(map);
		Map.Entry<Character, Integer> entryWithMaxValue = null;
		
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entryWithMaxValue == null || entry.getValue().compareTo(entryWithMaxValue.getValue()) > 0)
			{
				entryWithMaxValue = entry;
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
		
	}
}
