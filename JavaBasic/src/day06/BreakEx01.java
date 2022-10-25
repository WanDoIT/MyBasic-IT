package day06;

public class BreakEx01 {
	public static void main(String[] args) {

		/*int i =1;
		while(i <= 10) {
			System.out.println(i);

			if (i==5)break; //조건문 한줄만 사용 시 {}생략 가능 

			i++;
			*/
		for(int i =1; i<=10; i++) {
			System.out.println(i);
			if(i==5) break;
		}
	}
}