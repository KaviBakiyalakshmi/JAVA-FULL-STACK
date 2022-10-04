package InnerClass;

public class InnerClass_Demo
{
	private String msg="Welcome to Java";   
	class Inner
	{  
		  void hello()
		  {
			  System.out.println(msg+", Let us start learning Inner Classes");
		  }  
    }  

	
	public static void main(String[] args)
	{
		InnerClass_Demo obj=new InnerClass_Demo();
		InnerClass_Demo.Inner in=obj.new Inner();  
		in.hello();  


	}

}
