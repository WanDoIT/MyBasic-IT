package quiz06;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.result = 50;
		cal.add(100);
		System.out.println(cal.result);
		System.out.println("원을넓이 :" + cal.circle(3));

		Computer com = new Computer();

		System.out.println("원의넓이 :" + com.circle(3));

		System.out.println("정사각형넓이 :" + com.rect(5.5));

		System.out.println("직사각형넓이 :" + com.rect(1.5, 2));

		System.out.println("직육면체넓" + com.rect(1, 2, 3.5));
		
	}
}
