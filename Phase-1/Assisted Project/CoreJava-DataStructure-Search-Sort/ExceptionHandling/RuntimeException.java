package ExceptionHandling;

public class RuntimeException {

	public static void main(String[] args) 
	{
		String a="A";
		int number;
		number=Integer.parseInt(a);
		System.out.println("Number is "+number);
		
		
		System.out.println(10/0);
		String s1="";
		System.out.println(s1.charAt(0));

	}

}
