import java.util.Scanner;
import java.io.*;
public class FileRename {

	
	
	public void renameMethod(String s1,String s2)
	{
		
		//boolean b = F1.renameTo(F2);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of the fIle to be renamed :");
		String s1 = sc.next();
		s1 = s1+".txt";
		String F1 = "C:\\Users\\Faiz's\\Desktop\\"+s1;
		File file1 = new File(F1);
		System.out.print("Enter Name of the file to be renamed to :");
		String s2 = sc.next();
		s2 = s2+".txt";
		String F2 = "C:\\Users\\Faiz's\\Desktop\\"+s2;
		File file2 = new File(F2);
	    boolean exists = file1.exists();
	    boolean exists1 = file1.exists();
	    
	    if(exists)
	    {
	    	if(file1.isFile())
	    	{
	    		if(exists)
	    		{
	    			if(file1.length()<=500)
	    			{
	    				file1.renameTo(file2);
	    				System.out.println("file renamed sucessfully!");
	    			}
	    		}
	    	}
	    }
		
	}

}
