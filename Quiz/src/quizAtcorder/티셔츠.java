package quizAtcorder;

import java.util.Scanner;

public class 티셔츠 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		int A = Integer.parseInt(a.split(" ")[0]);
		int B = Integer.parseInt(a.split(" ")[1]);
		int C = Integer.parseInt(a.split(" ")[2]);
		int X = Integer.parseInt(a.split(" ")[3]);
		
		double result = 0;
		if(A>=X) {
			result = 1;
		} else if(A<X&&B>=X) {
			result = (double)C/(B-A);
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
	}
}
