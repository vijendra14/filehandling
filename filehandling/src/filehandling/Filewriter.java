package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriter 
{
public void method() throws IOException
{
	File f=new File("C:\\Users\\vijendra srivastav\\Desktop\\myfile.txt");
	FileWriter fw=new FileWriter(f, true);
	BufferedWriter bw=new BufferedWriter(fw);
	String data;
	
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the line");
	
	for (int i=1;i<=5;i++)
	{
		data=scan.nextLine();
		bw.write(data);
		bw.newLine();	
	}
	bw.close();
	scan.close();
}
public static void main(String[] args) throws IOException 
{
	Filewriter  v=new Filewriter ();
			v.method();		
}
}


     
   