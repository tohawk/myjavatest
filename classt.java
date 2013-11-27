class pri1{
	private int x;
	//public int x;
	void setX(int y){
		x = y;
	}
	int getX(){
		return x;
	}
}
public class classt{
	public static void main(String[] args){
		pri1 p = new pri1();
	//	p.setX(8);	
		int y =	p.getX();
		System.out.println(""+y);

	}
}
