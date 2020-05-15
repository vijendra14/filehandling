package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class filehandling1 

{
    @SuppressWarnings("resource")
	public void method(int x) throws IOException
    {
    	File f=new File ("C:\\Users\\vijendra srivastav\\Desktop\\vijendra.txt");
    	FileReader fr=new FileReader(f);
    	BufferedReader b=new BufferedReader(fr);
        String s;
    	int a=0;
    	
    	while ((s=b.readLine())!=null)
    	
    	{
    		a=a+1;
    		if (a==x)
    		{
    	System.out.println("value of string ="+s);
    }
}
}
    public static void main(String[] args) throws IOException 
    
    {
    	filehandling1 v=new filehandling1();
    	@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
    	System.out.println("Entre line Number");
    	int c=scan.nextInt(); 
    	v.method(c);
    	
    	
	}
}
