package day02;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		
	//입력받은 점수에 따라서 90점이상 A,80~90점 B,70~80점 C,60~70점 D,이하F로 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 > ");
		int score = scan.nextInt();
		
		String grade = null; //없는 값
		if(score >=90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >=80) {
			grade = "B";
		} else if (score >=70) {
			grade = "C";
		} else if (score >=60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}
}
