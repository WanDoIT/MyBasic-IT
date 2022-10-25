package quiz14;

public abstract class Unit {
	 public int x;
	 public int y;
	 public int hp;
	
	 public Unit(int hp) {
		 this.hp = hp;
	 }

	public abstract void location();

	public abstract void move(int x,int y);

	public abstract void stop();
	

	
	
}
