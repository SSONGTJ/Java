package test.mypac;
/*
 * 	new Student()
 * 	생성자를 call 하는 표현식
 * 	constructor 를 call 하는 표현식
 * 	클래스는 최소 하나의 constructor 를 가지고 있다.
 */
public class Student {
	
	// 생성자 (constructor) -> 얘는 default 라 안써도 됨. / 생성자를 명시적으로 정의하지 않아도 존재함
	// 따라서 생성자를 따로 만들지 않아도 new Student() 해서 객체를 생성할 수 있다.
	public Student() { // 클래스명과 같아야 함
		// 객체를 생성하는 시점에 무언가 준비 작업을 하고 싶으면 여기서 한다.
		System.out.println("Student() 생성자 호출됨");
		
		// return 타입이 명시되지 않았으니 얘는 메소드가 아님
	}
	
	public void study() {
		System.out.println("공부해요!");
	}
}
