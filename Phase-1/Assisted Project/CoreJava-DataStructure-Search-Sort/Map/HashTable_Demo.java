package Map;
import java.util.Map;
import java.util.Hashtable;

public class HashTable_Demo {

	public static void main(String[] args)
	{
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      //don not allow null values
		//map.put(4, null); //do not allows null value
		//map.put(null, "kavi"); //key is null but value is not null and not be added in map
				
		//you can add only one null key in map
		//map.put(null, null);//both key and value are null
				
	      ht.put(4,"Ales");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	      ht.put(7,"John"); 
	      ht.put(4, "null");
	      System.out.println(ht);
	      ht.remove(4);
	      System.out.println("Get element at key 6: "+ht.get(6));//as element is not present it will give you null answer
			
	      System.out.println("\nThe elements of HashTable are "+ht);  
	      for(Map.Entry m: ht.entrySet()) 
	      {
				
				System.out.println(m.getKey()+" , "+m.getValue());
		  }		
	}

}
