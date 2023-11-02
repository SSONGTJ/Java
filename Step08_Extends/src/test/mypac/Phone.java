package test.mypac;

// 가상의 옛날 가정용 전화기 객체를 생성 할 설계도라고 가정
public class Phone {	// 어떤 클래스도 상속받지 않으면 자동으로 extends object 된다.
		// 굳이 작성하지 않아도 존재하는 생성자
		public Phone () {
			System.out.println("Phone 생성자 호출됨");
		}
	
		// 전화거는 메소드
		public void Call() {
			System.out.println("전화를 걸어요!");
		}
}
