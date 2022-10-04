package ExceptionHandling;

public class Handlingwithexception
{

static void waitFor() 
{
		
		try 
		{
			System.out.println("Default Exception");
			Thread.sleep(2000);
		} 
		catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
}
	public static void main(String[] args)
	{
		waitFor();
	}

}
