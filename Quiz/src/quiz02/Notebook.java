package quiz02;

public class Notebook {

	String company;
	String model;
	String color;
	int price;
	
	Notebook (){
	
	}
	
	Notebook (String nCompany,String nModel,String nColor,int nPrice) {
		company = nCompany;
		model = nModel;
		color = nColor;
		price = nPrice;
	}
	
	
	
	
	
	void info() {
		System.out.println("정보 - "+"제조사:"+company+" / 모델명:"+model+
				" / 색상:"+color+" / 가격:"+price);
	}
	
	String grade() {
		String p = "";
		if(price > 1000000) {
			p = "고가";
		} else if (price >=500000) {
			p = "중저가";
		} else {
			p = "저가";
		}
		return p;
	}
	
	
	
}
