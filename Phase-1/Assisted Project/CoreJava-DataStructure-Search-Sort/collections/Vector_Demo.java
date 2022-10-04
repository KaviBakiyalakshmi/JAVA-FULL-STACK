package collections;

import java.util.Vector;

public class Vector_Demo 
{
	public static void main(String[] args)
	{
		Vector<Integer> num=new Vector<Integer>();
		num.add(null);
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(10);
		System.out.println(num);
		num.remove(null);
		System.out.println(num);
		System.out.println(num.contains(10));
		System.out.println(num.get(3));
       
	}

}
