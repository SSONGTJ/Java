package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 	3명의 회원정보 (번호, 이름, 주소) 를 HashMap 객체에 각각 담아서
		 * 	ArrayList 객체에 누적 시켜 보세요.
		 * 
		 * 	반복문 돌면서 ArrayList 객체에 누적된 회원정보를 콘솔창에 순서대로 출력해보세요.
		 * 	(HashMap 객체 3개, ArrayList 객체 1개 가 생성되어야 합니다.)
		 * 
		 * 	ArrayList 객체 안에 HashMap 을 담을 예정이니
		 * 	List<HashMap<String, Object>> type 이 필요합니다.
		 */
		
	
		Map<String,Object> info1 = new HashMap<>();
		info1.put("num", 1);
		info1.put("name", "김구라");
		info1.put("addr", "노량진");
		
		Map<String,Object> info2 = new HashMap<>();
		info2.put("num", 2);
		info2.put("name", "해골");
		info2.put("addr", "행신동");
		
		Map<String,Object> info3 = new HashMap<>();
		info3.put("num", 3);
		info3.put("name", "원숭이");
		info3.put("addr", "동물원");
		
		List<Map<String,Object>> plist = new ArrayList<>();
		
		plist.add(info1);
		plist.add(info2);
		plist.add(info3);
		
		for (int i=0; i<plist.size();i++) {
			System.out.println(plist.get(i));
		}
		
		// 확장 for 문 // for (		배열 혹은 List type + 이름	:	배열 혹은 List	){}
		for (Map<String,Object> tmp:plist) {
			String result = String.format("번호 : %d 이름 : %s 주소 : %s", 
					tmp.get("num"), tmp.get("name"), tmp.get("addr"));
			
			System.out.println(result);
		}
		
		
		
	}
}
