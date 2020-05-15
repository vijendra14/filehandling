package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffered 

{
   public static void main(String[] args) throws IOException 
   
    {
	   File f=new File("C:\\Users\\vijendra srivastav\\Desktop\\vijendra.txt");
	   FileReader fr=new FileReader(f);	   
	   BufferedReader b=new BufferedReader(fr);	   
	   String s;
	   int a=0;
	   while ((s=b.readLine())!=null)		   
	   {
		   a=a+1;
		   if(a==4) 
		   {
			   System.out.println(s);
			   break;
			   
		   }
		   
	   }
	   
	   
    }
   
}
