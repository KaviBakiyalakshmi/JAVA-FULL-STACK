package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Demo 
{

	public static void main(String[] args)
	{
	    ArrayList<String> city =new ArrayList<String>();
	    city.add("Chennai");//It preserve insertion order
	    city.add("Bangalore");
	    city.add("Delhi");
	    city.add("Chennai");//Allow duplicates
	    city.add(null);//Allow null values
	    System.out.println(city);
	    System.out.println(city.size());
	    System.out.println(city.contains(3));
	    System.out.println(city.contains("Chennai"));
	    System.out.println(city.remove(0));
	    System.out.println("Using For each loop");
		for(String s:city)
	    {
	    	System.out.println(s);
	    }
		System.out.println("using Iterator");
		Iterator itr=city.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	    

	}

}
