package quizAtcorder;

import java.util.Scanner;

public class 오버플로우내지않기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double N = scan.nextDouble();
		if(Math.pow(-2, 31)<=N&&Math.pow(2, 31)-1>=N) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
