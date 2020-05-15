package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readandwriter 

{
    public void method() throws IOException
   {
       File f=new File("C:\\Users\\vijendra srivastav\\Desktop\\file1.txt");	   
	   FileReader fr=new FileReader(f);
	   BufferedReader br=new BufferedReader(fr);
	   
	   
	   File f1=new File("C:\\Users\\vijendra srivastav\\Desktop\\file2.txt"); 
	   FileWriter fw=new FileWriter(f1);
	   BufferedWriter bw=new BufferedWriter(fw);
	   
	   
	   String line;
	   
	   
	      while ((line=br.readLine())!=null)
	   {
		   bw.write(line);
		   bw.newLine();
	   }
	      br.close();
	      bw.close();
	      System.out.println("Copy+paste file");
	            
       }
   public static void main(String[] args) throws IOException 
   {
	   readandwriter r=new readandwriter();
	   r.method();
   }
}
