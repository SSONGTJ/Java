package test.main;

import java.util.Random;

/*
 * 	반복문 while
 */
public class MainClass15 {
	public static void main(String[] args) {
		int count=0;
		//	무한 반복
//		while(true) {
//			count++;
//			System.out.println(count);
//		}
		
		
		// 반복회수가 정해져있지 않을 때는 for 보다 while 이 조금 더 낫다. 
//		while(count < 10) {
//			System.out.println(count);
//			count++;
//		}
		
		// 랜덤한 숫자를 얻어낼 Random 객체
		Random ran = new Random();
		int counting = 0;
		while(true) {
			int ranNum=ran.nextInt(100);
			System.out.printf("%d번 째 : %d %n", counting+1, ranNum);
			counting++;
			if(ranNum == 50) {
				break; // 반복문 블럭 탈출
			}
		}
		System.out.println("-----------------------");
		// 
		boolean isRun = true;
		while(isRun) {
			int ranNum=ran.nextInt(100);
			System.out.println(ranNum);
			if(ranNum==50) {
				isRun=false;
			}
		}
	}
}
