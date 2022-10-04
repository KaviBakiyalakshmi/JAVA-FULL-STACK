import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class validEmail {

	public static void main(String[] args) 
	{		    	
		      ArrayList<String> list= new ArrayList<String>();
		     // String[] strArray = new String[6];
		      list.add("kavi@gmail.com");
		      list.add("kavin@gmail.com"); 
		      list.add("mithu@gmail.com"); 
		      list.add("##@gmail.com"); 
		      list.add("kavi123@gmail.com");
		      list.add("yashu@gmail.com"); 
		      list.add("@123kavi.com");
		      
		    
		        
		      String searchElement;
		      System.out.println("E-mail: ");
		      Scanner scanner = new Scanner(System.in);
		      searchElement = scanner.nextLine();
		      String regex = "^(.+)@(.+)$";
		      Matcher matcher = Pattern.compile(regex).matcher(searchElement);
		      if (matcher.matches() && list.stream().anyMatch(mail -> mail.equals(searchElement)))
		      {
		          System.out.println(searchElement + " = is present");
		      } else 
		      {
		          System.out.println("Not a valid or is not present");
		      }
		                   
		                
		    
	}

}
