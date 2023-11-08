package test.main;
/*
 * 	run 했을 때 콘솔창에 경과 시간이 출력되는 프로그래밍을 해 보세요.
 */
public class QuizMain2 {
	public static void main(String[] args) {
		int sec = 1;
		int min = 0;
		int hour = 0;
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				if (sec == 60) {
					sec = 0;
					min ++;
				}
				if (min == 60) {
					min = 0;
					hour++;
				}
			
				System.out.println(hour+"시 "+min+"분 "+sec+"초");

				sec++;
		}
	}
}
