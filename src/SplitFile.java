import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SplitFile {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of the fIle you want split :");
		String s1 = sc.next();
		s1 = s1 + ".txt";
		String F1 = "C:\\Users\\Faiz's\\Desktop\\" + s1;

		System.out.print("Enter Name of the 1st file :");
		String s2 = sc.next();
		s2 = s2 + ".txt";
		String F2 = "C:\\Users\\Faiz's\\Desktop\\" + s2;

		System.out.print("Enter Name of the 2nd file :");
		String s3 = sc.next();
		s3 = s3 + ".txt";
		String F3 = "C:\\Users\\Faiz's\\Desktop\\" + s3;

		System.out.print("Enter Name of the 3rd file :");
		String s4 = sc.next();
		s4 = s4 + ".txt";
		String F4 = "C:\\Users\\Faiz's\\Desktop\\" + s4;

		System.out.print("Enter Name of the 4th file :");
		String s5 = sc.next();
		s5 = s5 + ".txt";
		String F5 = "C:\\Users\\Faiz's\\Desktop\\" + s5;

		File file1 = new File(F1);
		File file2 = new File(F2);
		File file3 = new File(F3);
		File file4 = new File(F4);
		File file5 = new File(F5);
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos1 = new FileOutputStream(file2);
		FileOutputStream fos2 = new FileOutputStream(file3);
		FileOutputStream fos3 = new FileOutputStream(file4);
		FileOutputStream fos4 = new FileOutputStream(file5);
		// FileOutputStream fos = new FileOutputStream(file2);
		byte[] buffer = new byte[(int) file1.length()];
		fis.read(buffer);
		int length =(int)file1.length();
		length = length / 4;

		/*
		 * for(int i=0;i<=length;i++) { fos1.write(buffer, 0, length); }
		 * 
		 * for(int i=length+1;i<=length*2;i++) { fos2.write(buffer, length + 1,
		 * length*2); }
		 * 
		 * for(int i=(length*2)+1;i<=length*3;i++) { fos3.write(buffer, (length*2) + 1,
		 * length*3); }
		 * 
		 * for(int i=(length*3)+1;i<=length*4;i++) { fos4.write(buffer, (length*3)+1 ,
		 * length*4); }
		 */

		
			fos1.write(buffer, 0, length);
			fos2.write(buffer, length + 1, length);
			fos3.write(buffer, (length * 2) + 1, length);
			fos4.write(buffer, (length * 3) + 1, length);
		

		System.out.println("file " + s1 + " sucessfully splitted !");

		/*
		 * while ((length = fis.read(buffer)) > 0) { fos.write(buffer, 0, length); }
		 */
		fis.close();
		fos1.close();
		fos2.close();
		fos3.close();
		fos4.close();

	}

}
