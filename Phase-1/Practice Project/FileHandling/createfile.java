

package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class createfile 
{   
	
	public static void createWriteAppendfile() throws IOException
	{
		//Create  the New File
		
    File file=new File("E:\\writeup\\createfile.txt");
    if(file.createNewFile())
    {
    	System.out.println("File is created");
    }
    else
    {
    	System.out.println("File is already exist");
    }
    
    
    
    // Write the data to the file
    
    FileWriter obj=new FileWriter(file,false);
    obj.write(" WRITE FILE--> This is how write files will work");
    obj.close();
    
  //Append text to the files
	
  	 FileWriter writer=new FileWriter(file,true);
  	    writer.write("\nAPPEND FILE--> This is appended text");
  	    writer.close();
    
    
	}
	
    // Read data to the files
	
    public static void readFileReaderClass() throws IOException
    {
    	
    FileReader obj1=new FileReader("E:\\\\writeup\\\\createfile.txt");
    int data;
    while((data=obj1.read())!=-1)
    {
    	System.out.print((char)data);
    }
    
	}
    
	
	public static void main(String[] args) 
	{
         try 
         {
			createWriteAppendfile();
			System.out.println("READ FILE--> Your file is successfully reader ");
			readFileReaderClass();
         }
		 
         catch (IOException e)
         {
		    System.out.println("File Not Available");
			e.printStackTrace();
		 }
         
	}

}
