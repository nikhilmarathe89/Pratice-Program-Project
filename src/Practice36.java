import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice36 
{
	public static void main(String[] args) 
	{
		String s = "this is that sample test";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j) && s.charAt(i)!=' ')
				{
					count++;
				}
			}
			map.put(s.charAt(i), count);
			count=0;
		}
		System.out.println(map);
		
		Map<Character, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				(e1,e2) -> e1, LinkedHashMap::new));
		
		//sortedMap.forEach((key, value) -> System.out.println(key + " " + value + " "));
		
		int newcount =0;
		for(Map.Entry<Character, Integer> newentry : sortedMap.entrySet())
		{
			if(newcount==8)
			{
				System.out.println("Key: " + newentry.getKey() + "  Value; " + newentry.getValue());
				break;
			}
			newcount++;
		}
	}
}
