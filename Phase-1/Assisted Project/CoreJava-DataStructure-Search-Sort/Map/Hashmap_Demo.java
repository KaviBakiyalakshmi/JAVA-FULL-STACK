package Map;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap_Demo
{

	public static void main(String[] args)
	{    
		 //It preserve insertion order
		//methods:put,get,remove,getkey
		//
		//value accept duplicates but key cannot accept null
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tim");    
	      hm.put(2,"Mary");    
	      hm.put(3,"Catie"); 
	      hm.put(4, null);
	      hm.put(null, "kavi");//duplicate
	      //if try to add more than one duplicate it can't print
	      hm.put(null, null);
	      hm.put(5,"Tim");
	      System.out.println(hm);
	      System.out.println("Elemets at Key 3 "+hm.get(3));
	      hm.remove(5);
	      System.out.println(hm);
	      for (Map.Entry m:hm.entrySet())
	      {
				
				System.out.println(m.getKey()+ " , "+m.getValue());
		  }

	}

}
