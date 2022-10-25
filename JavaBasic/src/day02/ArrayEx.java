package day02;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
	//배열은 선언, 생성, 초기화 과정을 거친다.
	//1. 배열의 선언
	int[] arr;
	
	//2. 배열의 생성
	arr = new int[5];
	
	System.out.println(arr); //주소값(위치)
	
	//3. 배열의 초기화
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	arr[3] = 40;
	arr[4] = 50;
	//arr[5] = 60; error
	
	//4. 배열의 사용
	System.out.println("arr첫번째상자 : "+arr[0]);
	System.out.println("arr세번째상자 : "+arr[2]);
	
	//5. 배열의 모습을 문자열로 확인하는 명령문
	System.out.println(Arrays.toString(arr));
	
	//6. 배열의 길이 확인하는 명령어 .length
	System.out.println("배열의 크기 : "+arr.length);
	
	//7. 배열의 선언과 생성을 동시에
	byte[] arr2 = new byte[10];
	
	//8. 배열의 선언 생성 초기화를 동시에
	int[] arr3 = {1,2,3,4,5,6,7,8};
	
	//배열의 초기값을 지정하지 않으면 각 타입의 기본값으로 자동 초기화(0,0.0,null로)
	System.out.println(Arrays.toString(arr2));
	System.out.println(Arrays.toString(arr3));
	
	System.out.println("------------------------------");
	
	/*
	 * 1. 스트링 배열의 생성하고 월,화,수,목 을 저장
	 * 
	 * 2. 크기가 3인 int배열을 생성하고 1~10중 랜덤값을 저장.
	 */
	
	String[] days = new String[4];
	days[0] = "월";
	days[1] = "화";
	days[2] = "수";
	days[3] = "목";
	System.out.println(Arrays.toString(days));
	
	int[] randNum = new int[3];
	int k = (int) ((Math.random()*10)+1);
	randNum[0] = (int) ((Math.random()*10)+1);
	randNum[1] = (int) ((Math.random()*10)+1);
	randNum[2] = k;
	System.out.println(Arrays.toString(randNum));
}
}