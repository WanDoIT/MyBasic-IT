package day10;

//대량 생산을 목적으로 하는 클래스는 메인이 없습니다.
public class Pen {

	//클래스에서 속성을 나타내는 것을 멤버변수(field)라고 부릅니다.
	String color;
	int price; //필드에서는 선언만 가능. 변수 바꾸기 불가능.
	String company;
	
	//클래서에서 기능을 나타내는 것을 메서드라고 부릅니다.
	void write() {
		System.out.println(color+"글씨를 씁니다");
	}
	
	void info() {
		System.out.println("===펜의 정보===");
		System.out.println("색상:"+color);
		System.out.println("가격:"+price);
		System.out.println("제조사:"+company);
	}
	
}
