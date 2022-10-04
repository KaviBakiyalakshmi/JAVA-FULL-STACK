package constructor;

public class Default_constructor
{
    int id;
    String name;
    long mobileNo;
    Default_constructor()
    {
    	System.out.println("This is Zero param constructor");//whenever creating the object that time itself default constructor called.
    }
    void display()
    {
    	System.out.println(id+" "+name+" "+mobileNo);
    }
    
	public static void main(String[] args) 
	{
		Default_constructor obj=new Default_constructor();
		Default_constructor obj1=new Default_constructor();
		//this is one way
		obj.display();
		obj1.display();
		//Another way calling
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.mobileNo);
		

	}

}
