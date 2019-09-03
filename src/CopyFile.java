import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
//import java.io.IOException;
public class CopyFile {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of the fIle to copy data to");
		String s1 = sc.next();
		s1 = s1+".txt";
		String F1 = "C:\\Users\\Faiz's\\Desktop\\"+s1;
		File file1 = new File(F1);
		System.out.print("Enter Name of the file to copy data from :");
		String s2 = sc.next();
		s2 = s2+".txt";
		String F2 = "C:\\Users\\Faiz's\\Desktop\\"+s2;
		File file2 = new File(F2);
		
		 boolean exists = file1.exists();
		    boolean exists1 = file1.exists();
		if(exists && exists1)
		{
			FileInputStream fis = new FileInputStream(file1);
			FileOutputStream fos = new FileOutputStream(file2);
			 byte[] buffer = new byte[(int) file1.length()];
	         int length;
	         
	         while ((length = fis.read(buffer)) > 0) {
	            fos.write(buffer, 0, length);
	         } 
	         fis.close();
	         fos.close();
	         
	         System.out.println("File Copied Scuessfully!");
		}
	}

}
