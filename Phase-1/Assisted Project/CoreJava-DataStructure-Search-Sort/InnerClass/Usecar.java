package InnerClass;

public class Usecar {

	public static void main(String[] args)
	{
		car car1= new carImp();
		car car2= new carImp();
		
		car1.start();
		car2.start();
		
		car1.stop();
		car2.stop();;
	}

}
