package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		// 키보드로 부터 입력 받을 수 있는 기능을 가진 객체 생성
		Scanner scan=new Scanner(System.in);
		
		// 개행기호를 출력하지 않고 콘솔창에 문자열 출력하기 .Print() 메소드를 활용하면 된다.
		System.out.print("문자열 입력 : ");
		
		//	문자열을 한줄 입력 받고 (입력하고 엔터 칠 때 까지 기다림)
		String str=scan.nextLine();
		//	입력 받은 문자열을 콘솔에 출력해보기
		System.out.println(str);
		System.out.println("main 메소드가 종료 되었습니다.");
	}
}
