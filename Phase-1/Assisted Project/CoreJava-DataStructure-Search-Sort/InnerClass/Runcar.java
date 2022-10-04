package InnerClass;

public class Runcar {

	public static void main(String[] args) 
	{
		
		car bmwCustomModel= new car() {
			public void start() {
				System.out.println("Special Implementaion of start");
			}
			public void stop() {
				System.out.println("Special implementation of stop");
			}
		};
		
		bmwCustomModel.start();
		bmwCustomModel.stop();
		
	}

}
