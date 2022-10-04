package pack1;

//1. Class is having Default access modifier 
class defAccessSpecifier
{ 
void display() 
   { 
       System.out.println("You are using default access specifier"); 
   } 
} 

//2. class is having private access specifiers
class priaccessspecifier 
{ 
private void display() 
{ 
  System.out.println("You are using private access specifier"); 
} 
}

public class AcessSpecifiers_default_private {

	public static void main(String[] args) 
	{
		// Display default Access specifier 
		//It access only with in the class and with in the package.
				System.out.println("Dafault Access Specifier");
			     defAccessSpecifier obj = new defAccessSpecifier(); 		  
		         obj.display();
		         
		  // Display private Specifier
		 		System.out.println("Private Access Specifier");
		 // The private members can be accessed only with in the class
         //Trying to access private method of another class by using Java Reflection Package.
	}

}
