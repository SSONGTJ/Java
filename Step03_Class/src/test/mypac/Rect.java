package test.mypac;
/*
 * 사각형 폭, 높이를 필드에 저장할 수 있어야 한다.
 * 픽드에 저장된 폭과 높이를 이용해서 사각형의 넓이를 콘솔창에 출력하는 메소드를 가지고 있어야 한다.
 * 필드와 메소드는 모두 non static으로 만들어라
 * 클래스명, 필드명, 메소드 명은 알아서 만들어라
 */
public class Rect {
	// 사각형의 폭과 높이를 저장할 필드
	public int width;
	public int height;
	
	// 면적을 출력하는 메소드
	public void printArea() {
		// 면적을 계산해서
		int area = width*height;
		// 출력하기
		System.out.println("면적은 : "+area);
	}
}
