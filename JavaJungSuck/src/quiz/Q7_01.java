package quiz;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		/*
		 * (1) . 배열 SutdaCard 를 적절히 초기화 하시오
		 */

		for (int i = 0; i < cards.length; i++) {
			cards[i] = new SutdaCard();

			if (i == 0 || i == 2 || i == 7) {
				cards[i].isKwang = true;
			} else {
				cards[i].isKwang = false;
			}
			cards[i].num = i % 10 + 1;
		}
	}

	void shuffle() {
		SutdaCard temp;
		for (int i = 0; i < cards.length; i++) {
			int ran = (int) (Math.random() * 20);
			temp = cards[i];
			cards[i] = cards[ran];
			cards[ran] = temp;
		}
	}

	SutdaCard pick(int index) {
		return cards[index];
	}

	SutdaCard pick() {
		int a = (int) (Math.random() * 20);
		return cards[a];
	}
	

}

 class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

// info() 대신 Object클래스의 toString()을 오버라이딩했다
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Q7_01 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	
		
	}
}

/*
 * 오버라이딩의 정의 : 상속받은 메서드의 내용을 변경하는 것.
 * 
 */
class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

