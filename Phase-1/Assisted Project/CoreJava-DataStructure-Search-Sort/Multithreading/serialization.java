package Multithreading;

import java.io.Serializable;

public class serialization implements Serializable 
{
	private int id;
	private String name;
	private transient String email; //don't serialize this value
	private String password;
	
	public serialization(int id,String name, String email, String password) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=password;
		
	}
	
	public void display() {
		System.out.println(id+ " "+name+" "+email+ " "+password);
	}

	public static void main(String[] args)
	{
		serialization s1 =new serialization(1, "test", "test@gmail.com", "test@1234");
		s1.display();
      
	}

}
