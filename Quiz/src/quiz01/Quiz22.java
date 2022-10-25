package quiz01;

public class Quiz22 {
	public static void main(String[] args) {

		method1();
		System.out.println(method2("하세요"));
		System.out.println(method3(1, 2, 3.15));
		System.out.println(method4(8));
		method5("반복", 2);
		System.out.println(maxNum(3, 5));
		System.out.println(abs(-9));

		String str = java(10);
		System.out.println(str);

		System.out.println(sum(6));
	}

	static void method1() {
		System.out.println("안녕");
	}

	static String method2(String a) {
		return a;
	}

	static double method3(int a, int b, double c) {

		return a + b + c;
	}

	static String method4(int a) {
		if (a % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}

	static void method5(String a, int b) {
		for (int i = 1; i <= b; i++) {
			System.out.println(a);
		}
	}

	static int maxNum(int a, int b) {
		int max = a < b ? b : a;
		return max;
	}

	static int abs(int a) {
		return Math.abs(a);
	}


	static String java(int a) {
		String sum = "";
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0) {
				sum += "자";
			} else {
				sum += "바";
			}
		}
		return sum;
	}
	

	static int sum(int a) {		
		int sum2 = 0;
		for (int i =1; i<=a; i++) {
			if(a%i==0) {
				sum2 +=i;
			}
		}
		return sum2;
	}
	

}
