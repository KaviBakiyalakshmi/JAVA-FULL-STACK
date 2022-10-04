package constructor;

public class parameterized_constructor 
{	
	int id;
    String name;
    
    public parameterized_constructor(int i, String n) 
    {
		id=i;
		name=n;
	}

	void display()
    {
    	System.out.println(id+" "+name);
    	
    }
    
	public static void main(String[] args) 
	{
		
		parameterized_constructor stu=new parameterized_constructor(1,"Kavi");
		parameterized_constructor stu1=new parameterized_constructor(2,"Jack");
		System.out.println("parameterized constructor");
		stu.display();
		stu1.display();
		
		
		
		
	}

}
