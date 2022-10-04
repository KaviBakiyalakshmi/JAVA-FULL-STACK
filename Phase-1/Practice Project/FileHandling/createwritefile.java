package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class createwritefile
{
	//Create New File
	
	public static void createFileUsingFileClass() throws IOException
	{
    File file=new File("E:\\writeup\\createfile.txt");
    if(file.createNewFile())
    {
    	System.out.println("file is created");
    }
    else
    {
    	System.out.println("File is already exist");
    }
    
    // Write data to the files 
    
    FileWriter obj=new FileWriter(file,false);//override files
    obj.write("This is how writer files will work");
    obj.close();
	
	
	//Append text to the files
	
	 FileWriter writer=new FileWriter(file,true);//override files
	    writer.write("\nThis is appended text");
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
	    
		
		System.out.println("file created");
		try {
			createFileUsingFileClass();
			readFileReaderClass();
		} catch (IOException e) {
			 System.out.println("File not available");
			e.printStackTrace();
		}
         
	}

}
