package test.mypac;
/*
 * 	Member 객체 하나에 회원의 번호, 이름, 주소를 담기 위해 Member 클래스를 설계 하려고 한다.
 */
public class Member {
	// 값을 입력 안하면 0, null 로 초기값이 잡힌다.
	// int type 을 담을 필드
	public int num;
	// String type 을 담을 필드
	public String name;
	public String addr;
	
	//	메소드
	public void showInfo() {
		// this. 은 나의 (바로 이 객체 / 해당 class라고 생각하면 됨..) 참조값을 가리킨다. 생략도 가능함
		//	단, 지역변수 명과 같지 않을경우에만 생략 가능..
		String info="번호는 "+this.num+" 이고, 이름은 "+this.name+" 이고, 주소는 "+this.addr+" 입니다.";
		System.out.println(info);
		
		Member a =this;
	}
}
