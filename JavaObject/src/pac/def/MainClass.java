package pac.def;

import pac.abc.Apple;
import pac.abc.Banana;

public class MainClass {
	public static void main(String[] args) {
		
		Melon m = new Melon();
		Apple a = new Apple();
		Banana b = new Banana();
		
		System.out.println(m); 
		
		String str1 = "hello";
		String str2 = "hello";
		boolean d = str1 == str2;
		System.out.println(d);
	}
}
