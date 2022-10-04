package Multithreading;

public class ThreadCreationAnotherWay implements Runnable
{
	public void run()
	{
		System.out.println("Runnable interface");
	}

	public static void main(String[] args)
	{
		ThreadCreationAnotherWay obj=new ThreadCreationAnotherWay();
	    
	    Thread t1=new Thread(obj);
	    t1.start();
     
	}

}
