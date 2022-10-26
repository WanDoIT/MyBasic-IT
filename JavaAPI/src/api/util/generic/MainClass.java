package api.util.generic;

public class MainClass {
	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 30;
		a(n1, n2);
		
		System.out.println(n1);
		System.out.println(n1+"/"+n2);
	}
	
	public static void a (int n1, int n2){

		int imsi = n1;
		n1 = n2;
		n2 = imsi;
		n1 -= 50;
		System.out.println(n1);
	}
	
	
}

