package day01;

public class CastingEx01 {

	public static void main(String[] args) {

		byte b = 10;
		
		int s = b; // byte -> int형으로 자동 형 변환(casting) / 작은 단위에서 큰 단위로 변환하는 것은 자동 형 변환이 가능함
		short i = b; // byte -> short형으로 자동 형 변환
		long l = b; // byte -> long형으로 자동 형 변환
		
		char c = '가';
		int j = c; // char -> int형으로 자동 형 변환

		System.out.println("'가'의 유니코드 숫자값은 : " + j);
		
		int k = 1000;
		double d = k; // int -> double형으로 자동 형 변환
		
		System.out.println(d);
		
		
	}

}
