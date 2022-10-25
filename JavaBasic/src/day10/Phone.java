package day10;

public class Phone {

	String model;
	int price;
	String color;

	// 생성자 -
	// 1.클래스가 객체로 처음 생성될 때 불려나가는 친구
	// 2.이름은 클래스명과 동일
	// 3.생성자를 만들지 않으면 자동으로 생성해줍니다.
	Phone() {
		System.out.println("생성자 호출됨");
		model = "애니콜";
		price = 1000;
		color = "빨강";
	}
	//생성자는 여러개 만들 수 있음. - 단 모형이 달라야 합니다.
	Phone(String pModel){
		model = pModel;
		price = 2000;
		color = "블루";
	}
	
	Phone(String pModel, int pPrice) {
		model = pModel;
		price = pPrice;
		color = "블랙";
	}
	Phone(int pPrice,String pModel) {
		model = pModel;
		price = pPrice;
		color = "화이트";
	}	
	Phone(String nColor, int pPrice,String pModel) {
		model = pModel;
		price = pPrice;
		color = nColor;
	}	
	
	
	void info() {
		System.out.println("===폰의 정보===");
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
		System.out.println("색상 : " + color);

	}

}
