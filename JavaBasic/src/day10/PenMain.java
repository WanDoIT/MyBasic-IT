package day10;

public class PenMain {
	public static void main(String[] args) {
		
		//펜의 기능을 사용할 때는 객체로 생성하고, 참조연산자 .을 사용합니다.
		Pen pen = new Pen();
	
		pen.color = "검정";
		pen.price = 1000;
		pen.company = "모나미";
		pen.write();
		pen.info();
		
		Pen red = new Pen();
		red.color= "빨강";
		red.price = 2000;
		red.company = "모나미";
		red.write();
		red.info();
		
		Calculator cal = new Calculator();
	
		System.out.println(cal.add(pen.price));
		System.out.println(cal.add(red.price));
		
	}
}
