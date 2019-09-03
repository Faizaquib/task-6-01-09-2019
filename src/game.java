import java.io.Serializable;


public class game implements Serializable {
	private int xPos;
	private int sPos;
	private int yPos;
	private transient gamePlayerInfo info=new gamePlayerInfo();
	
	public void moveH(int pts){
		xPos=xPos+pts;
	}
	public void moveV(int pts){
		yPos=yPos+pts;
	}
	public void moveS(int pts){
		sPos=sPos+pts;
	}
	public void showPos(){
		System.out.println("CURRENT POS : "+xPos+","+yPos+","+sPos);
	}
	
	
}
