package day14.encap.obj;

public class Hotel { //사용자클래스

	private Chef chef;
	//생성자 - 클래스를 받는 생성자
	public Hotel() {	}
	public Hotel(Chef chef) {
		this.chef = chef;
		
	}
	//getter , setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public Chef getChef() {
		return chef;
	}
	
}
