package hw2;

//使用while迴圈+ do while迴圈寫出99乘法表
public class hw0203 {
	public static void main(String[] args) {
		int i, j;
		i = 1;
		j = 1;
		while (i <= 9) {
			j=1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}
	}
}
