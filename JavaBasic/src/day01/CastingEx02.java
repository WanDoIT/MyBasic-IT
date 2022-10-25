package day01;

public class CastingEx02 {

	public static void main(String[] args) {

		/* 크기가 큰 타입을 작은 타입으로 변환할 때 (type) 캐스팅을 이용해서
		 * 명시적 형 변환을 해야함
		 * 
		 * 괄호 안에는 바꾸고 싶은 타입을 입력하면 됨
		 */
		
		// 강제타입변환?
		int i = 70;
		char c = (char) i;
		short s = (short)i;
		
		double d = 3.14;
		int k = (int)d;
		
		System.out.println(d); // .14 날아감
		
		/* 캐스팅을 할 때 주의할 점
		 * 해당 값을 받을 수 없는 범위가 들어오면 잘려나간 값(쓰레기값)이 저장이 됨
		 * 
		 */
		int a = 1000;
		byte b = (byte)a;
		
		System.out.println(b);
		
		/* char, short는 크기가 같지만
		 * 타입이 문자형과 숫자형으로 다르기 때문에 형 변환이 필요함
		 * 
		 */
		
		char cc = 'A';
		short ss = (short)cc;
		
	}

}
