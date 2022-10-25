package quiz14;

public class MainClass {
	public static void main(String[] args) {
		Marine m = new Marine();
		m.location();
		m.move(1, 2);
		m.location();
		
		Tank t = new Tank();
		t.location();
		t.move(2, 5);
		t.location();
		
	}
}
