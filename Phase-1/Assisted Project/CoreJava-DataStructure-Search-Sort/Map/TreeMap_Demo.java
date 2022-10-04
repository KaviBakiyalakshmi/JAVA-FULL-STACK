package Map;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap_Demo 
{

	public static void main(String[] args)
	{
		//null key is not accepted in tree map but null value can be accepted
				// treemap is implementation of map and sorted map
				//it maintains insertion order
		//key is not null but value is null
		//you can add only one null key in map
				//map.put(null, null);//both key and value are null
				
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Annie");    
	      map.put(9,"Carlotte");    
	      map.put(10,"Catie");  
	      map.put(11, null);
	      map.put(8, "kavi");
	      map.put(12, "Annie");
	      System.out.println(map);
	      map.remove(12);
	      map.get(8);
	      System.out.println("Get element at key 6: "+map.get(6));//as element is not present it will give you null answer
	      System.out.println("\nThe elements of TreeMap are "+map);  
	      for(Map.Entry l:map.entrySet())
	      {    
	       System.out.println(l.getKey()+" "+l.getValue()); 
		  
	      }

	}
}
