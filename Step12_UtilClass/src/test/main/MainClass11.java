package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		// sample 데이터 ( 영어사전 역할 )
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		/*
		 * 	[	콘솔창 실행 결과 1	]
		 * 	
		 * 	검색할 단어를 입력하세요 : house
		 * 	house 의 뜻은 집입니다.
		 * 	
		 * 	[	콘솔창 실행 결과 2	]
		 * 	
		 * 	검색할 단어를 입력하세요 : gura
		 * 	gura 는 목록에 없습니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		// 문자열 입력 받기
		System.out.printf("검색할 단어를 입력하세요 : ");
		//입력한 key 값을 이용해서 단어의 뜻을 찾는다. ( 없으면 null 이 리턴된다. )
		String str1 = scan.next();
		
		// 이 방법도 있다.
//		String mean=dic.get(str1);
//		
//		if (mean != null) {
//			System.out.printf("%s의 뜻은 %s이다. %n", str1,mean);
//		}	else {
//			System.out.println(str1+"은(는) 목록에 없다.");
//		}
		
		if (dic.containsKey(str1)) {
			System.out.printf("%s의 뜻은 %s이다. %n", str1,dic.get(str1));
		} 	else {
			System.out.println(str1+"은(는) 목록에 없다.");
		}
		
	}
}
