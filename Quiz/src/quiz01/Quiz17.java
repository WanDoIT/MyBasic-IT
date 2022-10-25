package quiz01;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		
		/*
		 *  up down 게임
		 *  1~100까지의 임의 숫자를 1번 생성
		 *  반복문 안에서 스캐너를 이용해서 정답을 입력받습니다
		 *  
		 *  랜덤수가 입력받은 값보다 작으면 "더 큰 수를 입력하세요"
		 *  랜덤수가 입력받은 값보다 크면 "더 작은수를 입력하세요"
		 *  
		 *  정답이라면 시도횟수 : x회를 출력하고 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int ran = (int) (Math.random()*100)+1;
		System.out.println(ran);
		int count = 0;
						
		while(true) {
			System.out.print("정답 입력 >");
			int answer = scan.nextInt();
			count++;
			if (answer < ran) {
				System.out.println("더 큰 수를 입력하세요");
			} else if (answer > ran){ 
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println("정답입니다 시도횟수 >"+count);
				break;
			}
		}
		
	}
}
