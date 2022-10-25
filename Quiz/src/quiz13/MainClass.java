package quiz13;

public class MainClass {
	public static void main(String[] args) {
		
		Circle c = new Circle("원형",4);
		System.out.println(c.getName());
		System.out.println(c.getArea());
		
		Shape r = new Rect("사각형",5);
		System.out.println(r.getArea());
		System.out.println(r.getName());
		
	}
}
