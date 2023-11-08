package test.mypac;

import java.util.ArrayList;
import java.util.List;

public class MyUtil {
	// 문자열을 전송하는 가상의 메소드
	public static void sendMessage(String msg) {
		// 금지된 단어 목록
		List<String> list = new ArrayList<>();
		list.add("바보");
		list.add("멍청");
		list.add("똥개");
		
		
		// 전송할 문자열에 금지어가 있는지 확인하기
		
//		if (list.contains(msg)) {
//			// 예외 발생 시키기
//			throw new WordFilterException("욕 하면 안되지 짜식아");
//		}
		
		// for 문
//		for (int i = 0; i<list.size(); i++) {
//			String badword=list.get(i);
//			if (msg.contains(badword)){
//				throw new WordFilterException(badword+"는 금지");
//			}
//		}
		
		//확장 for 문
//		for (String badword:list) {
//			if (msg.contains(badword)){
//				throw new WordFilterException(badword+"는 금지");
//			}
//		}
		
		// forEach 문
		list.forEach(badword->{
			if (msg.contains(badword)){
				throw new WordFilterException(badword+"는 금지");
			}
		});
		
		System.out.println(msg+" 을(를) 전송 했습니다.");
		
	}
	
	// 5초가 걸리는 가상의 그림을 그리는 메소드
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("그림 완성!");
	}
	
	// 5초가 걸리는 가상의 전송을 하는 메소드
	public static void send() throws InterruptedException {
		System.out.println("5초 동안 전송을 해요...");
		
		Thread.sleep(5000);
		
		System.out.println("전송 완료!");
	}
}
