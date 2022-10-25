package day04;

public class DoWhileEx {
	public static void main(String[] args) {
		// while문이 do~while문 대체 가능. 사용빈도 적음.

//	int i = 1;
//	int sum = 0;
//	while(i <=10) {
//		sum += i;
//		i++;
//	}
//	System.out.println(sum);

		// do~while문은조건이 거짓이더라도 무조건 한번은 실행한다.
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println(sum);
	}
}
