import java.util.Scanner;

public class Arithmetic_Calculator {

	public static void main(String[] args) 
	{
		
	 Scanner scr=new Scanner(System.in); 
	 
	 
	 System.out.println("Choose an operator: +,-,*, or /");
	 char operator=scr.next().charAt(0);
	
	 System.out.println("Enter the First Number");
	 double num1=scr.nextDouble();
	
	 System.out.println("Enter the second Number");
	 double num2=scr.nextDouble();
	 
	 double Result;
	 
	 switch(operator)
	 {
	   case '+':
		   Result=num1+num2;
		   System.out.println(num1+ "+" + num2+ "=" +Result);
		   break;
	   case '-':
		   Result=num1-num2;
		   System.out.println(num1+ "-" + num2+ "=" +Result);
		   break;
	   case '*':
		   Result=num1*num2;
		   System.out.println(num1+ "*" + num2+ "=" +Result);
		   break;
	   case '/':
		   Result=num1/num2;
		   System.out.println(num1+ "/" + num2+ "=" +Result);
		   break;
	   default:
		   System.out.println("Invalid operator!");
		   break;
     
	 }
	 
	}

}
