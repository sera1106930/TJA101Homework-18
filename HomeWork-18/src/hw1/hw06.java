package hw1;

public class hw06 {

	public static void main(String[] args) {
		System.out.println(5+5);//本行為數字5+數字5
		System.out.println(5+'5');//本行為數字5+字元5，字元5的unicode為53，故相加為58
		System.out.println(5+"5");//本行為數字5+字串5，串連後為55(前方為數字，後方為文字5)
	}
}
