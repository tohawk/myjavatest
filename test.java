/**********************
 * parent class 
 * ********************/
public class test extends parent{
	private String name;
	private int age;
	public test(){
		name = "tohawk";
		age = 20 + num;
	}
	public static void main(String args[]) {
		test t = new test();
		//t.parent();
		//t.Test();
		System.out.println(t.name + "'age is " + t.age);
	}
} 
class parent{
	//private int num = 1;
	public int num = 1;
	public parent(){
		System.out.println("init patent");
		System.out.println("changed at 0900");
	}
	public void Test(){
		System.out.println("parent's funtion");
		System.out.println("changed for branch");
	}
}
