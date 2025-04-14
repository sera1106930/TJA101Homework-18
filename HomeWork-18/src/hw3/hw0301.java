package hw3;

import java.util.Scanner;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果：
//(提示：Scanner，三角形成立條件，判斷式if else)
public class hw0301 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("輸入第一個邊長");
		 int a = scanner.nextInt();
		 System.out.print("輸入第二個邊長");
		 int b = scanner.nextInt();
		 System.out.print("輸入第三個邊長");
		 int c = scanner.nextInt();
		if( a+b>c && a+c>b && c+b>a) {//這是判斷是否為三角形
			if(a==b&&b==c) {
			System.out.println("這是正三角形");
		}else if (a==b || b==c || a==c) {
			System.out.print("這是等腰三角形");
		}else {
				System.out.println("這是其他三角形");
		}
			}else{
				System.out.println("這不是三角形");
			}
		}

}
