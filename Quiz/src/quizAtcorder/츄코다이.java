package quizAtcorder;

import java.util.Scanner;

public class 츄코다이 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int a = scan.nextInt()-1;
		int b = scan.nextInt()-1;
		
		String result = S.substring(0, a)+S.charAt(b)+S.substring(a+1, b)+
				S.charAt(a)+S.substring(b+1, S.length());
		
		System.out.println(result);

	}
}
