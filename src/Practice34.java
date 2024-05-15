import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.databricks.client.jdbc42.internal.apache.logging.log4j.util.PropertySource.Comparator;

public class Practice34 
{
	public static void main(String[] args) 
	{
		String s = "this is the test";
        Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(m.isEmpty() || !m.containsValue(s.charAt(i)) && s.charAt(i) != ' ')
            {
            	for(int j=0;j<s.length();j++)
            	{
            		if(s.charAt(i) == s.charAt(j))
            		{
            			count++;
            		}
            	}
            	m.put(s.charAt(i), count);
            	count=0;
            }
        }
        if(Map.entry(s,3) != null)
        {
        	System.out.println(m);
        }
	}
}
