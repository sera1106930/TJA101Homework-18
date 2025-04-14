package hw2;
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
public class hw0206 {
	public static void main(String[]args) {
		 int a=1;
		 int i=1;
		 while(i<10) {
			 System.out.println(a+"="+a+"*"+i);
			 a=a*i;
			 i++;

		 }
			System.out.println("連乘積結果為"+a);
	 }
	}
