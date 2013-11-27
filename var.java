public class var{
	public static void main(String args[]){
		class Weixueyuan{
			String name="微学苑";
			String url="http://www.weixueyuan.net/";
			int age=3;

			public void say(){
				System.out.println(name+"的网址是："+url);
				System.out.println(name+"的年龄是："+age);
			}
		}
		Weixueyuan obj1=new Weixueyuan();  //创建对象的同时进行初始化
		obj1.say();
	}
}
