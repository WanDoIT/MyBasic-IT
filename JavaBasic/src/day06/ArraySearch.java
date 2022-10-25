package day06;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		// 배열을 다루는방법
		
		// 탐색 -> 순차탐색, 이진탐색(속도 빠름)
		Scanner scan = new Scanner(System.in);
		int[] arr = {30,10,20,50,40,60,100,110,90,80};
		// 입력받은 값의 위치를 출력
		int find = scan.nextInt();
		
		int index = -1;
		
		for(int i = 0; i < arr.length; i++) {
		 
			if(arr[i]==find) {//찾은 경우
				index = i;
				break;
			}
		}
		System.out.println("인덱스위치 : "+index);
		
		
		}
}

