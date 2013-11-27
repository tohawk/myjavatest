public class Outer3{
	private int size;
	public class Inner{
		private int size;
		public void dostuff（int size）{
			size++;  // 本地的 size;
			this.size; // 内部类的 size
			Outer3.this.size++;  // 外部类的 size
		}
	}
	public static main(String[] args){
		System.out.println("iiiiii");
	}
}
/*
public class inner{
	public static main(String[] args){
		Other3 other = new Other3();
		Other3.Inner inner = new Other3.Inner();
		Other3.Inner.dostuff inner = new Other3.Inner.dostuff();
	}
}
*/
