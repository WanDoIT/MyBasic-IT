package quiz04;

public class Player {

	String name;
	int hp;
	int mp;
	int level = 1;
	int exp;
	
	void info() {
		System.out.println("케릭명:" + name);
		System.out.println("레벨:"+level);
		System.out.println("hp:" + hp);
		System.out.println("mp:" + mp);
	}
	
	void mItem() {
		System.out.println("mp포션 사용");
		mp += 50;
	}
	
}
