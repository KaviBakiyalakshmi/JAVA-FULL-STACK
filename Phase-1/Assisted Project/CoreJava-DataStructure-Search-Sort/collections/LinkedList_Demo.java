package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo
{

	public static void main(String[] args)
	{
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add(null);
	      names.add("Alex");  
	      names.add("John");  
	      names.add("Alex");
	      names.remove(0);
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext())
	      {  
	      System.out.println(itr.next()); 
	      }
	}
}
	  
	
