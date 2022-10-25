package day17.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Dog d = new Dog(); //eat, play
		//Animal d = new Dog(); //eat
		//Ipet d = new Dog(); //play
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		//1.Animal 배열에 저장
		Animal[] arr = {baduk, nabi, hodol};
		
		for(Animal a : arr) {
			a.eat();
		}
		
		//2. 바둑이는 Animal이지만 생성된 클래스가 인터페이스 상속을 받고 있다면, 상호형변환이 된다.
		
		Ipet i1= (Ipet) arr[0];
		Ipet i2 = (Ipet) nabi;
		Ipet i3 = new GoldFish();
		Ipet[] arr2 = {i1,i2,i3};
		
		for(Ipet i : arr2) {
			
			i.play();
		}
		System.out.println("=================");
		PetHouse.a(i2);
		PetHouse.b(arr2);
		
		
		
	}
}
