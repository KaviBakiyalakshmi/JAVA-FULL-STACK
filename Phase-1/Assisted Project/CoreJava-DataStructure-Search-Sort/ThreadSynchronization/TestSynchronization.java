package ThreadSynchronization;

public class TestSynchronization {

	public static void main(String[] args)
	{
Sender sender = new  Sender();
		
		user t1= new user("kavi", "Hello Good morning....!", sender);
		user t2= new user("hey  kavi ","Hii!! how  are you?",sender);
		
		t1.start();
		t2.start();

	}

}
