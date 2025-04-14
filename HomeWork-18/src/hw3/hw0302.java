package hw3;
//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息
import java.util.Scanner;
import java.util.Random;

public class hw0302 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int trueNumber = random.nextInt(10);
		int guessNumber;
		
		while(true) {
			System.out.print("輸入一個0~9的數字");
			guessNumber = scanner.nextInt();
			
		if (guessNumber == trueNumber) {
			System.out.println("恭喜你答對了，正確數字是"+trueNumber);
			break;
		}else {
			System.out.println("錯誤可以再試一次");
		}
		
		
		}
	}

}
