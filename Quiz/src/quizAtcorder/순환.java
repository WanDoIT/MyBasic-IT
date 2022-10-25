package quizAtcorder;

import java.util.Scanner;

public class 순환 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int abc = scan.nextInt();
		int a = abc/100;
		int b = (abc/10)%10;
		int c = abc%10;
		int result = a+a*10+a*100+b+b*10+b*100+c+c*10+c*100;
		
		System.out.println(result);
		
	}
}
