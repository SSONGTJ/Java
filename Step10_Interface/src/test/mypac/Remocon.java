package test.mypac;
/*
 * 		interface 는 실행 할 메소드를 가지고 있으면 안된다. 무조건 모양만 정의해야된다. 추상메소드밖에 없기 때문에 추상 예약어 쓸 필요도 없음
 * 
 * 		[ interface ]
 * 
 * 		- 생성자가 없다 ( 단독 객체 생성 불가 )
 * 		- 구현된 메소드는 가질 수 없다 ( 추상 메소드만 가질 수 있다 )
 * 		- 필드는 static final 상수만 가질 수 있다
 * 		- data type 의 역할을 할 수 있다.
 * 		- interface type 의 참조값이 필요하면 구현(implements) 클래스를 만들어서 객체를 생성해야 한다.
 * 		- 클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
 */
public interface Remocon {
	// 필드는 static final 필드만 가질 수 있다 ( static final 은 생략 가능 )
	public String COMPANY="LG";		// public static final String COMPANY="LG";
	public void up();
	public void down();
}
