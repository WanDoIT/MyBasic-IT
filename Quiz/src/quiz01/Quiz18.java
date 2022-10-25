package quiz01;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		/*
		 * 랜덤한 덧셈 문제를 내는 프로그램
		 * 반복이 실행될 때마다 1~100사이의 랜덤한 덧셈 구문이 출력 됩니다.
		 * 
		 * 0을 입력받으면 프로그램 종료
		 * 프로그램이 종료되면 정답횟수,오답횟수를 출력하면됩니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		int tCount = 0;
		int fCount = 0;
		while(true) {
			int ran1 = (int) (Math.random()*100)+1;
			int ran2 = (int) (Math.random()*100)+1;
			System.out.println(ran1+" + "+ran2+" = ?");
			System.out.println("문제를 그만 푸시려면 0을 입력");
			System.out.print(">");
			int num = scan.nextInt();
			if (num==0) {
				System.out.println("프로그램 정상 종료");
				break;
			} else if (num!=ran1+ran2) {
				System.out.println("오답입니다.");
				System.out.println("---------");
				fCount++;
			} else if (num == ran1+ran2) {
				System.out.println("정답입니다.");
				System.out.println("---------");
				tCount++;
			}
		}
		System.out.println("정답횟수 : "+tCount);
		System.out.println("오답횟수 : "+fCount);
		
	}
}
