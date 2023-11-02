package test.mypac;

public class AndroidPhone extends HandPhone {
	// 생성자
	public AndroidPhone () {
		System.out.println("AndroidPhone 생성자 호출됨");
	}
	// 메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	@Override
	public void takePicture() {
		System.out.println("3000만 화소의 사진을 찍슴둥");
	}
}
