package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// frist programe is read character by character//
public class class1 

  { 
     public static void main(String[] args) throws IOException 
     
     {
		File f=new File("C:\\Users\\vijendra srivastav\\Desktop\\vijendra.txt");
		FileReader fr=new FileReader(f);
		int a;
		while ((a=fr.read())!=-1)
		{
			System.out.println((char)a);
			
	     }
     } 
  }
	