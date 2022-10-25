package quiz01;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		//정수를 하나 입력 받습니다.
		//이 정수가 짝수인지, 홀수인지 if문을 통해서 구분해보세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력값(정수)>");
		int num = scan.nextInt();
		if (num==0) {
			System.out.println(0);
		} else if (num%2 ==0) { 
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		scan.close();
	}
}
