package VirtualKey;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VirtualLocker 
{
	
	
	 public static void mainMenu() 
	 {
	    	System.out.println("Please select one the following");
	        System.out.println("1 for current file names in ascending order ");
	        System.out.println("2 for your Business Operation");
	        System.out.println("3 for exit application");
	    	
	 }
	 
	 
	 
	// 1. current file names in ascending order 
     public static void listingFileAsc()
     {
   	  
  	   File f=new File("E:\\writeup");
	   File arr[]=f.listFiles();
	   Arrays.sort(arr);
	   for(File k:arr)
	   {
		if(k.isFile()) 
		{
			System.out.println(k.getName());
		}
		else if (k.isDirectory()) 
		{
			System.out.println(k.getName());
		}
		
        else
        {
          System.out.println(f.getAbsolutePath() + " is not a directory");
        }
	  }
      VirtualLocker.mainMenu();

    }
	 
     
    // 2. we have to perform Business Operation
	 public static void fileMenuOperations() 
	 {
	    	
	    	System.out.println("Please choose one of the following options :");
	        System.out.println("1. Create a file");
	        System.out.println("2. Delete a File");
	        System.out.println("3. Search for a File");
	        System.out.println("4. for main menu");
	        Scanner sc2=new Scanner(System.in);
	    	try 
	    	{
	    		
	            int choice=sc2.nextInt();
	             switch(choice) 
	             {
	             case 1:
	                 System.out.println("You have selected to create file");
	                 createFile();
	                 break;
	             case 2:
	                 System.out.println("You have selected to Delete file");
	                 deleteMethod();
	                 break;
	             case 3:
	                 System.out.println("You have Selected to search file");
	                 searchMethod();
	                 break;
	             case 4:
	                 System.out.println("Going back to MainMenu");
	                 VirtualLocker.mainMenu();
	                 break;
	             }

	        }
	    	catch(Exception e)
	    	{
	           System.out.println("Oops!! Please Enter valid number");
	           VirtualLocker.fileMenuOperations();
	        }
	    }
	 
	
      
    public static void createFile() 
    {
        
        File file = new File("E:\\writeup");
     
        Scanner sc = new Scanner(System. in );
        System.out.println("Enter the file name : ");
        String name = sc.nextLine(); 
        File file1 = new File("E:\\writeup\\"+name);

        try 
        {
            if (file1.createNewFile())
            {
                System.out.println("File Created! :)");
                VirtualLocker.fileMenuOperations();
            } 
            else 
            {
                System.out.println("File already exists :(");
                VirtualLocker.fileMenuOperations();
            }
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    }



    
    public static void deleteMethod() 
    {
        String filename;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Name of File to Delete: ");
        filename = scan.nextLine();

        File file= new File("E:\\Writeup\\"+filename);

        if (file.delete()) 
        {
            System.out.println("File deleted successfully");
            VirtualLocker.fileMenuOperations();
        }
        else
        {
            System.out.println("Oops !! File not found.Please try again ");
            VirtualLocker.fileMenuOperations();
        }

    }
    
    public static void searchMethod()
    {
        System.out.println("Enter the name of the file to Search");
        Scanner s1 = new Scanner(System.in);
        String folderName = s1.next();
        File file = new File("E:\\writeup\\"+folderName);

        if (file.exists())
        {
            System.out.println("Yep! File found!! :)"+"\n"+"This is the file location");
            System.out.println(file.getAbsolutePath());
            VirtualLocker.fileMenuOperations();
        } 
        else 
        {
            System.out.println("Sorry, File Not Found :(");
            VirtualLocker.fileMenuOperations();
        }

    }
   
    
    public static void main(String[] args) 
    {

        System.out.println("********************************");
        System.out.println("Welcome to VIRTUAL KEY LOCK ME :) ");
        System.out.println(" LockerMe.com");
        System.out.println("Develop by KAVI");
        System.out.println();
        System.out.println("**************************************");
        
        Scanner sc=new Scanner(System.in);
        VirtualLocker.mainMenu();
        while(true)
        {
            
           try 
           {
        	
              int option=sc.nextInt();
              switch(option) 
              {
                case 1 :
                    System.out.println("These are the files in ascending");
                    listingFileAsc();
                    break;
                case 2 :
                	VirtualLocker.fileMenuOperations();
                	break;
                    
                case 3 :
            	   System.out.println("Have a nice day!! Thanks for using Virtual Key Repository locker ");
                   System.out.println("Application closed");

                   System.exit(option);
                    break;
                default:
                    System.out.println("Oops!! please enter the valid number");
                    break;
              }
            
           }
           catch(Exception e)
           {
               System.out.println("Oops!! Please Enter valid number");
               VirtualLocker.main(args);
           }
       }
    }
}
