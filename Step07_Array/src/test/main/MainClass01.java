package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		// int type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역변수에 담기
		int[] nums = {10, 20, 30, 40, 50};
		System.out.println(nums[2]);
		
		// double type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums2 라는 지역 변수에 담아보세요.
		double[] nums2= {9.2,11.5, 12.7, 16.9, 20.5};
		System.out.println(nums2[3]);
		
		//	String type (참조데이터 type) 5개를 저장하고 있는 배열
		String[] city= {"서울","인천","경기","부산","광주"};
		System.out.println(city[2]);
		
		// 배열 객체의 복제본 얻어내기
		int[] result=nums.clone(); // 이 경우는 새로 복제(생성)하는거
		int[] result2=nums; // 이 경우는 기존 원본 개념
		
		// 배열의 크기 얻어내기
		int size=nums.length;
		//	배열은 순서가 있는 데이터이다. 특정 index 의 item 참조하는 방법
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
		
	}
}
