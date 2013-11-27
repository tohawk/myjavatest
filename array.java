public class array{
	public static void main(String[] args){
		int a[];
		a = new int[10];
		String str[];
		str = new String[10];
		int i;
		for(i=0;i<10;i++)
			System.out.println("a[i]="+(i*i));
		str[0] = new String("aaabbbccc");
		str[1] = new String("py");
		str[2] = new String("java");
		str[3] = new String("javac..");
		str[4] = new String("..........................................");
		str[5] = new String("diy my java");
		str[6] = new String("learning it well");
		str[7] = new String("you can do it");
		str[8] = new String("nothing to say");
		str[9] = new String("o0OzZ~~~");

		for(i=0;i<10;i++)
			System.out.println(str[i]);
		array2.array2();
			}
}
class array2{
	public static void array2(){
		int i,j,k;
		int a[][]=new int [2][3]; 
		int b[][]={{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
		int c[][]=new int[2][4];
		for (i=0;i<2;i++)
			for (j=0; j<3 ;j++)
				a[i][j]=(i+1)*(j+2);
		for (i=0;i<2;i++){
			for (j=0;j<4;j++){
				c[i][j]=0;
				for(k=0;k<3;k++)
					c[i][j]+=a[i][k]*b[k][j];
			}
		}
		System.out.println("*******Matrix C********");
		for(i=0;i<2;i++){
			for (j=0;j<4;j++)
				System.out.println(c[i][j]+" ");
			System.out.println();
		}
	}
}
	

