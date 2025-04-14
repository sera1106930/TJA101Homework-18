package hw1;

public class hw03 {
	public static void main(String[] args){
		int all = 256559;
		int day = 86400;
		int hour = 3600;
		int  min= 60;
		
		System.out.println( (int) (all/day)+"天"+((all%day)/hour)+"小時"+(((all%day)%hour)/min)+"分"+((((all%day)%hour)%min))+"秒");
		
		
		

	}
}
