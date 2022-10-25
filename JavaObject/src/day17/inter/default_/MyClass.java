package day17.inter.default_;

public class MyClass implements MyInter{

	@Override
	public void some1() {
		System.out.println("some1오버라이딩");
		
	}

	@Override
	public void some2() {

		MyInter.super.some2();
	}
	
	
}
