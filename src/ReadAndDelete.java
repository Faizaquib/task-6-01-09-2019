import java.io.*;
import java.util.Scanner;
public class ReadAndDelete {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of the fIle you want to write data to :");
		String s1 = sc.next();
		s1 = s1+".txt";
		String F1 = "C:\\Users\\Faiz's\\Desktop\\"+s1;
		File file = new File(F1);
		
		byte[] buffer = new byte[(int) file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(buffer);
		
		 String s = new String(buffer);
         System.out.println("File content: " + s);
         
         fis.close();
        /* if(file.delete()) 
         { 
             System.out.println("File deleted successfully"); 
         } 
         else
         { 
             System.out.println("Failed to delete the file"); 
         } */

	}

}
