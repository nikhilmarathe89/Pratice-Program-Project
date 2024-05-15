import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practice15 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(100,"Amit");  
		map.put(109,"Vijay");  
		map.put(107,"Rahul"); 
		map.put(103,"Amit");  
		map.put(105,"Vijay");  
		map.put(110,"Rahul"); 
		System.out.println(map);

	}
}
