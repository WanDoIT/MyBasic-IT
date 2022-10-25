package day17.inter.basic3;

public class PetHouse  {
	
	// 1.Ipet 타입을 받아서 기능을 출력하는 메서드
	public static void a(Ipet ipet) {
		ipet.play();
		
	}
	
	// 2. Ipet[] 타입을 받아서 기능을 전부 출력하는 메서드
	public static void b(Ipet[] arr) {
		for(Ipet i : arr) {
			i.play();
		}
	}

	
}
