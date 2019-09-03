import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Scanner;

public class MergeFiles {
	
	public static void mergeFiles(File[] files,File mergeFile) throws IOException
	{
		FileWriter fw = new FileWriter(mergeFile,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(File f : files)
		{
			System.out.println("Merging "+f.getName());
			FileInputStream fis = fis = new FileInputStream(f);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String aLine;
			while ((aLine = in.readLine()) != null) {
				bw.write(aLine);
				bw.newLine();
			}
			fis.close();
		}
		bw.close();
	}
	
	public static void main(String...args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of files to merge :");
		int No = sc.nextInt();
		File[] files = new File[No];
		
		for(int i = 0;i<No;i++)
		{
			System.out.print("Enter Name of the fIle you want to merge :");
			String s1 = sc.next();
			s1 = s1+".txt";
			String F1 = "C:\\Users\\Faiz's\\Desktop\\"+s1;
			files[i] = new File(F1);
		}
		
		System.out.print("Enter Name of the fIle you want to write data to :");
		String s1 = sc.next();
		s1 = s1+".txt";
		String F1 = "C:\\Users\\Faiz's\\Desktop\\"+s1;
		
		
		File mergeFile = new File(F1);
		mergeFiles(files, mergeFile);
	}
	

}
