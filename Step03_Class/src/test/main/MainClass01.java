package test.main;
// 다른 패키지의 클래스를 사용할 때는 import 를 해야한다.
import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		// test.mypac.Car 클래스로 객체를 생성하고 생성된 객체의 참조값을 car1 이라는 지역변수에 담기
		Car car1 = new Car ();
		// 메소드 호출
		car1.drive();
		// 필드에 저장된 값 참조(불러오기)
		String a = car1.name;
		// 필드에 값 대입하기
		car1.name = "소나타";
		// 대입한 이후에 필드에 저장된 값 참조(불러오기)
		String b = car1.name;
	}
}

/*
 * 	In javascript
 * 
 * 	let car1 = {name:null, drive:function(){console.log("달려요")}}
 * 	car.drive();
 * 	let a = car1.name;
 * 	car1.name = "소나타";
 *   	let b = car1.name; 
 */