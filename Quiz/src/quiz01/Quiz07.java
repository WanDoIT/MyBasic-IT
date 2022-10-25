package quiz01;
import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//		int a = 1;
		//		while (a <= 20) {
		//			System.out.println(a + "번 학생의 출석을 체크");
		//			a++;
		//		}
		/*
		 * 정수를 입력받아서 입력받은 값에 대한 구구단을 출력.
		 */

		System.out.print("정수를 입력하세요>");
		int j = scan.nextInt();
		System.out.println("구구단 : " + j + "단");

		int i = 1;
		while (i <= 9) {
			//System.out.println(j + " X " + i + " = " + (j * i));
			System.out.printf("%d x %d = %d\n", j,i,j*i);
			i++;
		}
	}
}
