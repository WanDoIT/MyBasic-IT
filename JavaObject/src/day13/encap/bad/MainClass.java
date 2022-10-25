package day13.encap.bad;

public class MainClass {
	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		//변수를 public으로 만들어두면, 잘못된 값이 저장될 수 있다.
		me.year = 2023;
		me.month = 13;
		me.day = 32;
		me.ssn = "아무값";
		
		me.info();
	}
}
