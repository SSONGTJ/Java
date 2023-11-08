package test.main;

public class QuizMain {
	/*
	 *		run 했을 때 콘솔창에
	 *		1초
	 *		2초
	 *		3초
	 *		.
	 *		.
	 *		경과 시간이 출력되다가
	 *		.
	 *		.
	 *		10초
	 *		까지만 출력하고 종료되는 프로그래밍을 해보슈
	 */
	public static void main(String[] args) {
		int time = 1;
		while(time < 11) {
			try {
				// 스레드를 일정시간 지연 시키기 (milli second 단위로 숫자를 전달하면 된다.
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(time+"초");
			time++;
		}
		try {
			// 스레드를 일정시간 지연 시키기 (milli second 단위로 숫자를 전달하면 된다.
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("끝");
	}
}
