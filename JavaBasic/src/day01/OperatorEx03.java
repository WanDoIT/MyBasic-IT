package day01;

public class OperatorEx03 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if 뒤에는 조건이 온다. true라면 if문 실행, false라면 else문 실행. 
		if( x != 10 && ++y == 21) { // x가 false 이므로 뒤 ++y는 실행안함
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x값 : " + x + ", y값 : " + y); //따라서 y값은 20그대로.
		
		if(x == 10 || ++y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		System.out.println("x값 : " + x + ", y값 : " + y);
	}
}
