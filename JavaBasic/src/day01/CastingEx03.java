package day01;

public class CastingEx03 {

	public static void main(String[] args) {

		//연산에서의 형 변환
		//char + int가 왜 int인가 : 서로 다른 타입을 연산할 경우 큰 타입으로 자동 형 변환
		// int가 기준이 되어 int보다 작으면 그냥 무조건 int로 자동 형 변환 -> 다른 언어도 비슷 ex) byte + byte = int
		// 컴퓨터는 8byte, 4byte 단위로 연산, 8byte로 바꿔 넉넉하게 계산 진행 (int)
		char c = 'C'; // 67
		int i = 2;
		
		
		//서로 다른 타입의 연산에서는 큰 타입을 따라감
		char cc = (char)(c + i); // 그냥 적으면 c만 char형으로 변환됨. 그러므로 c+i를 묶어야함
		int ii = c + i;
		
		System.out.println(cc); //E의 유니코드 : 69
		System.out.println(ii); //69
		
		int j = 10;
		double d = 3.14;
		double result = j + d;
		
		System.out.println(result); //69
		
		//int형보다 작은 타입의 연산에서는 무조건 int가 됨
		byte b1 = 20;
		byte b2 = 10;		
		byte b3 = (byte)(b1 + b2); // 자동으로 int가 되므로, b3을 byte로 선언하고 싶으면 강제 타입 변환을 해야함
		int b4 = b1 + b2;
		System.out.println(b3);
		short s1 = 100;
		byte s2 = 10;
		
		int s3 = s1 + s2;
		
		
		
	}

}
