package InnerClass;
abstract class innerclass
{
	public abstract void display();
}

public class Anonymous_inner_class 
{

	public static void main(String[] args)
	{
		innerclass obj=new innerclass()
		{
			public void display()
			{
				System.out.println("Anonymous Inner Class");
			}
		};
		obj.display();

	}

}
