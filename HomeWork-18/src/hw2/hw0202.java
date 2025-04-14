package hw2;
//使用for迴圈+ do while迴圈寫出99乘法表
public class hw0202 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			j=1;
			do {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				
		
			} while (j < 9);
			System.out.println();
		}
	}
}
