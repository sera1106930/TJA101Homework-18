package hw1;

public class hw05 {
	public static void main(String[] args) {
		double a = 1500000;
		double rate=1.02;
		
		for (double count = 0; count <= 10; count++){
			a=(a*rate);
			
		}
		System.out.println("最後總共是"+ a +"元");
	}	

}

