package quiz01;
import java.util.Scanner;

public class Quiz06 {

	
	public static void main(String[] args) {


		
		Scanner scan = new Scanner(System.in);

		System.out.print("정수1>");
		int a = scan.nextInt();
		System.out.print("연산을 선택하세요[+,-,*,/,%]");
		String i = scan.next();
		System.out.print("정수2>");
		int b = scan.nextInt();

		String[] arr = { "+", "-", "*", "/", "%" };

		switch (i) {
		case "+":
			System.out.println("두 수의 덧셈은 : " + (a + b));
			break;
		case "-":
			System.out.println("두 수의 뺄셈은 : " + (a - b));
			break;
		case "*":
			System.out.println("두 수의 곱셈은 : " + (a * b));
			break;
		case "/":
			System.out.println("두 수의 나눗셈 몫은 : " + (a / b));
			break;

		case "%":
			System.out.println("두 수의 나눗셈 나머지는 : " + (a % b));
			break;
		}
	}
}
