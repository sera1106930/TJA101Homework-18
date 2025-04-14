package hw2;
////請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class hw0210 {
	public static void main(String[]args) {
		String[]letters = {"A","B","C","D","E","F"};
			for(int i = 0; i<letters.length;i++) {
			for(int j = 0; j<=i ; j++ ) {
				
				System.out.print(letters[i]);
				}
			System.out.println();
			}				 									
	}
}
