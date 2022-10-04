package ExceptionHandling;

public class customException 
{
	static void check(int age) throws AgeNotValidException
	{
       if(age<18)
    	  throw new AgeNotValidException("user can not vote Before 18");
       else
       {
            System.out.println("user can vote");
       }
	}

	public static void main(String[] args) {
		try {
			check(16);
		} catch (AgeNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
