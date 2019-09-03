import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of the fIle you want to write data to :");
		String s1 = sc.next();
		s1 = s1+".txt";
		String F1 = "C:\\Users\\Faiz's\\Desktop\\"+s1;
		FileWriter fw=new FileWriter(F1); 
		//File file1 = new File(F1);
		System.out.print("Enter data you want to write to the file "+s1+" :");
	//	String s = sc.next();
		
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
      
     // Reading data using readLine 
     String s = reader.readLine(); 
		
		
			fw.write(s);    
        fw.close(); 
        //System.out.println(s);

        System.out.println("Data written Scuessfully!");

	}

}
