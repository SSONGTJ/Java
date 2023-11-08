package test.main;

import java.util.Scanner;

import test.mypac.MyUtil;
import test.mypac.WordFilterException;

public class MainClass06 {
	public static void main(String[] args) {
		// 문자열을 입력 받을 객체
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.printf("전송할 문자열 입력 : ");
			String inputMsg=scan.nextLine();
			// MyUtil 클래스의 static 메소드를 이용해서 전송하기
			try {
				MyUtil.sendMessage(inputMsg);
			} catch (WordFilterException e) {
				// 예외 메시지를 콘솔창에 출력
				System.out.println(e.getMessage());
			}
			
		}
	}
}
