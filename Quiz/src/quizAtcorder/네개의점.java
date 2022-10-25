package quizAtcorder;

import java.util.Scanner;

public class 네개의점 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력 하세요 > ");
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		String row3 = scan.nextLine();
		
		int x1 = Integer.parseInt(row1.split(" ")[0]);
		int y1 = Integer.parseInt(row1.split(" ")[1]);
		int x2 = Integer.parseInt(row2.split(" ")[0]);
		int y2 = Integer.parseInt(row2.split(" ")[1]);
		int x3 = Integer.parseInt(row3.split(" ")[0]);
		int y3 = Integer.parseInt(row3.split(" ")[1]);
		
		int x =0;
		int y =0;
		if(x1==x2) {
			x = x3;
		} else { x = x1;}
		
		if(y1==y2) {
			y = y3;
		} else { y = y1;}
		
		System.out.println(x+" "+y);
		
	}
}
