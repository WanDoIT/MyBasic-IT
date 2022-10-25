package day16.abs.good;

public class SeoulStore extends Store{

	@Override
	public void apple() {
		System.out.println("서울지점 사과는 500원");
		
	}

	@Override
	public void melon() {
		System.out.println("서울지점 메론은 600원");
		
	}

	@Override
	public void orange() {
		System.out.println("서울지점 오렌지는 700원");
		
	}

}
