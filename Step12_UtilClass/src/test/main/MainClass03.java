package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		//	인삿말을 담을 ArrayList 객체를 생성해서 참조값을  List 인터페이스 type 지역변수에 대입하기
		List<String> greets=new ArrayList<String>();
		greets.add("헬로우");
		greets.add("안녕하세요");
		greets.add("구텐탁");
		
		Consumer<String> con = new Consumer<>() {
			public void accept(String t) {
				System.out.println(t);
			};
		};
		//forEach() 메소드는 Consumer 인터페이스 type 을 매개 변수로 전달해야 한다.
		greets.forEach(con);
		
		System.out.println("---------------");
		
		greets.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);				
			}
			
		});
		
		System.out.println("---------------");
		greets.forEach((t)->{
			System.out.println(t);
		});
	}
}
