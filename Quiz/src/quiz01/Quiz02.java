package quiz01;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 키가 140이상이고, 나이가 8세 이상이라면 탑승가능, 아니라면 탑승불가능.

		Scanner scan = new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요.");

		System.out.print("키(실수)>");
		double A = scan.nextDouble();
		System.out.print("나이(정수)>");
		int B = scan.nextInt();
		
		if (A >= 140 && B >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다.");
		} else {
			System.out.println("놀이가구 탑승이 불가능합니다.");
		}
		scan.close();

	}
}
