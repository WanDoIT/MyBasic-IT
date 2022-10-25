package quiz12;

public class MainClass {
	public static void main(String[] args) {

		MyCart my = new MyCart(3000);
		
		Computer com = new Computer();
		Radio radio = new Radio();
		Tv tv = new Tv();
		
		//my.buy(new Tv()); 객체생성없이 이렇게도 가능.
		my.buy(com);
		my.buy(tv);
		my.buy(radio);
		my.buy(radio);
		my.buy(tv);
		my.buy(tv);

		

	}
}
