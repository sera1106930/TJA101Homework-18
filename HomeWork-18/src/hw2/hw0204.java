package hw2;
//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
public class hw0204 {
 public static void main(String[]args) {
	 int a=0;
	 int i;
	 for( i=0 ; i<=1000 ; i+=2) {
		
		 a=a+i;

	 }
		System.out.println(a);
 }
}
