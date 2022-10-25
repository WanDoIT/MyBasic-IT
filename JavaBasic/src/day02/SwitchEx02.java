package day02;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		// IfEx02와 동일하게 실행되도록 switch구문으로 변경
		Scanner scan = new Scanner(System.in);

		String grade = null;
		int score = scan.nextInt();
		int score2 = score / 10;

		switch (score2) {
		case 9:
			grade = "A";
			if (score >= 95) {
				grade = "A+";
			}
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		System.out.println(grade);
	}
}
