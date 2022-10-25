package day12.overload;

public class MainClass {
	public static void main(String[] args) {
	
		Basic b = new Basic();
		b.input(0);
		
		b.input(null);
		
		b.input(0, null);
		
		b.input(null, 0);
		
		b.input(11, 3.14, 1);
		
		
		
}
}
