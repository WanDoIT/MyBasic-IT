package quizAtcorder;

import java.util.Scanner;

public class QQ해결사 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		
		int result = Integer.parseInt(Character.toString(S.charAt(0)))*Integer.parseInt(Character.toString(S.charAt(2)));
		
		System.out.println(result);
		

	}
}
