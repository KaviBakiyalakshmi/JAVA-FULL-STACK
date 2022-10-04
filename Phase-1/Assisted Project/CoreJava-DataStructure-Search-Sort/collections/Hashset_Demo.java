package collections;

import java.util.HashSet;

public class Hashset_Demo 
{

	public static void main(String[] args)
	{
		HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       set.add(null);
	       System.out.println(set);
	       set.add(101);
	       System.out.println(set);
	       System.out.println("Size: "+set.size());
			
		   System.out.println(set);
			
		   System.out.println("Contains: "+ set.contains(55));
			
		   set.remove(null);


	}

}
