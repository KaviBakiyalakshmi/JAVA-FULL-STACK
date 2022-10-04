package ThreadSynchronization;

class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending\t" +msg);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			System.out.println("Thread Interruption");
			e.printStackTrace();
		}
		System.out.println("\n" +msg+"Sent");
	}
}

class ThreadSend extends Thread
{
	private String msg;
	private Thread t;
	Sender sender;
	ThreadSend(String m,Sender obj)
	{
		msg=m;
		sender=obj;
	}
	public void run()
	{
		synchronized(sender) //with synchronized
		{
			sender.send(msg);
		}
		//sender.send(msg);//without synchronization
	}
	
}

public class Synchronization
{

	public static void main(String[] args) 
	{
        Sender snd = new Sender(); 
        ThreadSend S1 = 
            new ThreadSend( " Hi " , snd ); 
        ThreadSend S2 = 
            new ThreadSend( " Bye " , snd ); 
        S1.start(); 
        S2.start(); 

        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 

        

	}

}
