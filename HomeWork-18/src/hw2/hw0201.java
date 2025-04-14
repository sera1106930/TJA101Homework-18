package hw2;
//使用for迴圈+while迴圈寫出99乘法表
public class hw0201 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (9 >= j) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				
				j++;
			}
			System.out.println();
		}
	}
}