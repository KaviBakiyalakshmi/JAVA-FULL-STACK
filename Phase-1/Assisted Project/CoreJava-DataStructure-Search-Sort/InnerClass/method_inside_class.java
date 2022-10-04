package InnerClass;

public class method_inside_class 
{
	private String msg="Inner Classes";
	
	 void display()
	 {  
		 class Inner
		 {  
			 void msg()
			 {
				 System.out.println("Method inside the inner class");
				 System.out.println(msg);
			 }  
	  }
	Inner l=new Inner();  
	l.msg();  

}
	public static void main(String[] args) 
	{
		method_inside_class obj=new method_inside_class();
		obj.display();

	}

}
