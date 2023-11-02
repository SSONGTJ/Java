package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 	1. run 했을 때
		 * 		cherry, apple, banana, melon, 7
		 * 		5개의 문자열 중에서 1개가 랜덤하게 출력되게 해봐.
		 * 
		 * 		hint)
		 * 		Random 객체와 String[] 객체를 활용해
		 */
		
//		String [] list = {"cherry","apple","banana", "melon","7"};
//		Random ran=new Random();
//		int ranc=ran.nextInt(list.length);
//		System.out.println(list[ranc]);
		
		String [] list = {"cherry","apple","banana", "melon","7"};
		int ranc=new Random().nextInt(list.length);
		System.out.println(list[ranc]);
		
	}
}
