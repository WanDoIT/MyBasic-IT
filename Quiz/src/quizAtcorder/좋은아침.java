package quizAtcorder;

import java.util.Scanner;

public class 좋은아침 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		int A = Integer.parseInt(a.split(" ")[0]);
		int B = Integer.parseInt(a.split(" ")[1]);
		int C = Integer.parseInt(a.split(" ")[2]);
		int D = Integer.parseInt(a.split(" ")[3]);
		
		if(A*60+B<=C*60+D) {
			System.out.println("Takahashi");
		} else {
			System.out.println("Aoki");
		}
	}
}
