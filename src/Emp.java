/*import java.io.FileInputStream;
import java.util.Scanner;
public class Emp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee number : ");
		int eno=sc.nextInt();
		System.out.println("Enter employee name");
		String ename =sc.next();
		System.out.println("Enter Employee salary : ");
		int salary=sc.nextInt();
		System.out.println("Enter Employee designation : ");
		String desg =sc.next();
		System.out.println("Enter Employee department : ");
		String dept =sc.next();
		

	}

}*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Emp {

    private static final String filepath="C:\\Users\\Faiz's\\Desktop\\Employee.java";
	public static void main(String[] args)  throws Exception{
		
		  Emp objectIO = new Emp();
		System.out.println("enter size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Employee[] emp=new Employee[size]; // s is array
		
		for(int i=0;i<emp.length;i++)
		{	System.out.println("enter eno");
			int no=sc.nextInt();
				System.out.println("enter ename");
			String ename=sc.next();//	sc.nextLine();
				System.out.println("enter salary");
			double sal=sc.nextDouble();
				System.out.println("enter designation");
			String designation=sc.nextLine();sc.nextLine();
				System.out.println("enter department");
			String dept=sc.nextLine();
			 sc.nextLine();
			emp[i]=new Employee(no,ename,sal,designation,dept);
			
			
		}
		
		objectIO.WriteObjectToFile(emp);
		for(Employee st:emp)
		{
			System.out.println(st.getEno()+" "+st.getEname()+" "+st.getSalary());
			
		}

		objectIO.WriteFileToObject(emp);
	}

	private Emp objectIO;

	private void WriteObjectToFile(Employee[] emp) {
		// TODO Auto-generated method stub
		try {
			 
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            for(Employee x:emp)
            	objectOut.writeObject(x);
            System.out.println();
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void WriteFileToObject(Employee[] emp) throws Exception
	{
		FileInputStream fis = new FileInputStream(filepath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee obj=null;
	 
	for(int i=0;i<emp.length;i++)
		{
			obj = (Employee)ois.readObject();
			System.out.println("Employee [eno=" + obj.getEno() + ", ename=" + obj.getEname() + ", salary=" + obj.getSalary() + ", designation=" + obj.getDesignation()
					+ ", department=" + obj.getDepartment() + "]");
	}
		
		
	}

}
