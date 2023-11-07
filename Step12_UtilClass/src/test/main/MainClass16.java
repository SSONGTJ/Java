package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass16 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("껍데끼");
		names.add("랄랄");		
		
		// 반복자 객체 얻어내기
		Iterator<String> it = names.iterator();
		// 더이상 데이터가 없을 때까지 반복문을 수행한다.
		while(it.hasNext()) {
			String item=it.next();
			System.out.println(item);
		}
	}
}
