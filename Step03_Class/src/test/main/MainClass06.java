package test.main;
/*
 *		static 메소드에서 사용하는 필드는 static 필드로 만들어야 사용할 수 있다.
 */
public class MainClass06 {
	//	field or static field
	// method or static method
	
	//	field
	//	int num = 999;
	
	// static field
	static int num = 999;
	
	//	static method
	public static void main(String[] args) {
		
		// main() 메소드와 num 이라는 필드는 동일한 클래스의 멤버이기 때문에 MainClass06. 은 생략 가능
		int result = MainClass06.num+1;
		
		//main() 메소드와 test() 이라는 메소드는 동일한 클래스의 멤버이기 때문에 MainClass06. 은 생략 가능
		MainClass06.test();
	}
	
	//	method
	// static 메소드에서 사용하는 메소드는 static 메소드로 만들어야 사용할 수 있다.
	public static void test() {
		
	}
}
