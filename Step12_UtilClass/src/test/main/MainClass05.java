package test.main;

import java.util.ArrayList;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		// 1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담아보세요.
		//	2. 3명의 회원정보를 Member 객체에 각각 담아보세요. (Member 객체가 3개 생성되어야 함)
		// 	3. 위에서 생성된 Member 객체의 참조값을 ArrayList 객체에 모두 담아보세요.
		ArrayList<Member> members = new ArrayList<>();
		
		Member mem1=new Member(1,"김구라","노량진");
		Member mem2=new Member(2,"해골","행신동");
		Member mem3=new Member(3,"원숭이","동물원");
		
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		
		/*
		 *		4. members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로 반복문 돌리면서 출력 해 보아라
		 *
		 * 		번호 : 1, 이름: 김구라, 주소 : 노량진
		 * 		번호 : 2, 이름: 해골, 주소 : 행신동
		 */
		
		for (int i=0;i<members.size();i++) {
			Member m=members.get(i);
			System.out.println("번호 : "+m.num+", 이름 : "+m.name+", 주소 : "+m.addr);
		}
		System.out.println("--------------------------------------------------------");
		for (Member m:members) {
			System.out.println("번호 : "+m.num+", 이름 : "+m.name+", 주소 : "+m.addr);
		}
		System.out.println("--------------------------------------------------------");
		members.forEach((m)->{
			System.out.println("번호 : "+m.num+", 이름 : "+m.name+", 주소 : "+m.addr);
		});
		System.out.println("--------------------------------------------------------");
		/*
		 * 	숫자 : %d // 문자열 : %s
		 * 	String.format("format 문자열",전달할 값1, 전달할 값2, .....)
		 */
		members.forEach((m)->{
			String result=String.format("번호 : %d, 이름 : %s, 주소 : %s", m.num,m.name,m.addr);
			System.out.println(result);
		});
		
		System.out.println("--------------------------------------------------------");
		members.forEach((m)->{
			System.out.println(String.format("번호 : %d, 이름 : %s, 주소 : %s", m.num,m.name,m.addr));
		});
	}
}
