package hw04;

public class hw0401 {
//有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	
	public static void main(String[] args) {
		int [] numbers = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
			int  sum = 0;
			
			int i = 0;
			for (i=0; i < numbers.length;i++) {
			sum += numbers[i];
			
			
			}
			System.out.println("陣列內數字合計為" + sum);
			double average =  (double) sum / numbers.length;
			
			System.out.println("平均總合="+ average);
			
			System.out.println("大於平均數的數字有");
			
			for(i=0; i<numbers.length;i++ )
				
				if(numbers[i]>average)
					
			System.out.print(numbers[i]+" ");
			
			
	}
			
}

