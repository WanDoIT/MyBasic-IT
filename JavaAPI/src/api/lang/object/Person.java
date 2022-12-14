package api.lang.object;

public class Person /*extends Object*/implements Cloneable {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	} // generate toString
 //오버라이딩 toString 

	//멤버변수 명이 같으면 true반환
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			String n = p.getName();
			
			if(n.equals(this.name)) {
				System.out.println("이름이같음");
				return true;
			}
		}
		return false;
	}
	//clone 메서드를 사용하고 싶다면 오버라이드 필요
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	
	
	
	
}
