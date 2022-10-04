package Multithreading;

public class MyRunnableThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
			System.out.println("Main Thread:"+i);
			
		}
		System.out.println("End of my Thread");
	}


	public static void main(String[] args) 
	{
		System.out.println("Starting main Thread....");
		
		MyRunnableThread obj=new MyRunnableThread();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		//t1.start();//parallel execution
		//t2.start();
		t1.run();//Sequential execution
		t2.run();
		
	}

}
