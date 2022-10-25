package day13.modi.protec.pac2;
import day13.modi.protec.pac1.A;

public class C extends A{

	public C() {
		super(); // 패키지가 다르더라도, super키워드를 통한 접근은 가능.
		super.s="홍길도";
	}
}