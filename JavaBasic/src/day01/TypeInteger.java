package day01;

public class TypeInteger {

	public static void main(String[] args) {
		//byte, short, int, long
		byte a = 127;
		byte b = -128;
		
		short c = 32767;
		short d = -32768;
		
		int e = 2147483647;
		int f = -2147483648;
		
		long g = 123123123123123123L; // long은 L을 붙임
		
		/* 2진수 저장할 때는 숫자 앞에다가 0b를 붙임
		 * 8진수 저장할 때는 0을 붙임
		 * 16진수 저장할 때는 0x을 붙임
		 */
		
		int bin = 0b1010; //2진수
		int octa = 064; //8진수
		int hexa = 0xAC00; // 16진수
		
		System.out.println("이진수 1010은: " + bin + "입니다");
		System.out.println("팔진수 64는: " + octa + "입니다");
		System.out.println("십육진수 AC00은: " + hexa + "입니다");
		
		System.out.println("-------------------------");
		
		float f1 = 3.14f; // float는 F를 붙임
		double d1 = 3.14;
		
		float f2 = 3.1415923333f; // 7자리까지 유효함
		double d2 = 3.1415923333; // 15자리까지 유효함, 또한 얘네들은 7자리, 15자리 안에서 정수부와 소수부를 지들이 알아서 분배함

		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println("-------------------------");
		
		//e표기법
		float f3 = 314.15e-2f; // 10의 -2승
		double d3 = 0.031415e2; // 10의 2승
		
		System.out.println(f3);
		System.out.println(d3);
		
		System.out.println("-------------------------");

		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		
		
	}

}
