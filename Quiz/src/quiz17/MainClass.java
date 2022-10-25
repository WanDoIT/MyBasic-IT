package quiz17;

public class MainClass {
	public static void main(String[] args) {
		Validation v = new Validation();
		try {
			System.out.println(v.masking("9409061234567"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("---------------------");
		
		System.out.println(v.palindromeCheck("바보보바"));
		
	}
}
