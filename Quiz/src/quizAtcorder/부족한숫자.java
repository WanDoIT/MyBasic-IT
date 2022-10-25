package quizAtcorder;

import java.util.Scanner;

public class 부족한숫자 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		int a = 0;
		for(int i = 0; i<=s.length();i++) {
			if(s.indexOf(Integer.toString(i))==-1) {
				a = i;	break;
			}
			System.out.println(a);
	}
}
}
