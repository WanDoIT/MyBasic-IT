package day16.static_.basic;

public class Calculator { //사용자클래스
	
	//계산기마다 다른값을 지닌다면 일반변수
	//계산기마다 같은 값이라면 정적변수
	private String model;
	private int rusult;
	public static double pi = 3.14;
	
	//일반 멤버변수를 사용하는 메서드는 static이면 안된다.
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRusult() {
		return rusult;
	}
	public void setRusult(int rusult) {
		this.rusult = rusult;
	}

	/*
	 * 일반 변수를 사용하지 않고, 범용성 있게 사용할 메서드는 static을 붙이면 좋다.
	 */
	public static double circle(int r) {
		return Math.PI * r * r;
	}
	
}
