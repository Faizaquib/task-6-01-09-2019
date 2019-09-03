import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class StartGame {

	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mode 1 For New Game, 2 For Resuming Previous One : ");
		int ch=sc.nextInt();
		System.out.println("Horizontal Move : ");
		int x=sc.nextInt();
		System.out.println("Vertical Move : ");
		int y=sc.nextInt();
		System.out.println("Space Move : ");
		int z=sc.nextInt();
		game g=null;
		
		if(ch==1){
			g=new game();
		}else{
			//read the object from file
			
			FileInputStream fis=new FileInputStream("C:\\Users\\Faiz's\\Desktop\\Prevgame.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			g=(game) ois.readObject();
			
		}
		
		g.moveH(x); g.moveV(y);g.moveS(z);
		g.showPos();
		
		System.out.println("Saved!");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Faiz's\\Desktop\\Prevgame.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g);
		oos.close(); fos.close();
		System.out.println("game closed!");
		
		
		
		
		
		
		

	}

}
