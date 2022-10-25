package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {

		/*
		 * 1. 사람수(정수)를 입력을 받습니다. 
		 * 2. 입력받은 사람 수 만큼 랜덤한 배열을 생성해서 중복되지 않게 랜덤값 저장.
		 * 
		 * 랜덤값 크기 1 <= x <= 사람수
		 * 3. 중복되지 않는 배열이 생성되었다면, ○문자를 이용해서 배열의 크기를 출력
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 5. 제대로 선택된 좌석이면 자리번호를 공개하고 출력
		 * 	  제대로 선택되지 않은 좌석이면 다시 선택을 출력
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석 크기 지정 >");
		int n = scan.nextInt();
		int[] arr = new int[n];

		int index = 0;
		while(true) {
			int ran = (int) (Math.random() * n + 1);

			for(int i= 0; i <index; i++) {
				if(arr[i] == ran) continue;
			}
			arr[index] = ran;
			index++;
			if(index == n) break;

		}

		//		for (int i = 0; i < arr.length; i++) {
		//			int ran = (int) (Math.random() * n + 1);
		//			arr[i] = ran;
		//			for (int j = 0; j < i; j++) {
		//				if (arr[i] == arr[j]) {
		//					i--;
		//				}
		//			}
		//		}
		int count = 0;
		while (true) {
			System.out.println();
			System.out.println("-----좌석 선택 프로그램-----");

			for (int a = 1; a <= arr.length; a++) {
			//	System.out.printf("%-3d",a); // %-3d = 3자리 공간을 잡고 왼쪽부터 채움(문자는%-3s)
				System.out.print(a + " ");
			}
			System.out.println();
			for (int a = 0; a < arr.length; a++) {
				if (arr[a] != 0) {
					System.out.print("○ ");
				} else {
					System.out.print("● ");
				}
			}
			
			System.out.println();
			System.out.print("좌석 선택 >");
			
			int seat = scan.nextInt() - 1;
			if (seat < 0 || seat > n) {
				System.out.println("다시선택");
			} else {
				if (arr[seat] == 0) {
					System.out.println("다시선택");
				} else {
					System.out.println("자리 번호 공개 >" + arr[seat]);
					arr[seat] = 0;
					count++; //좌석 선택 시 카운트 증가
					}
			}
			if(count==n) {
				System.out.println("종료합니다");
				break;
			}
		}
	}
}

