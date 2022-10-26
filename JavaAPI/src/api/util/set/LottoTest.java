package api.util.set;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class LottoTest {
	public static void main(String[] args) {
		//랜덤한 숫자를 추출하기 위한 인스턴스 생성
		Random r = new Random();
		
		//ArrayList 활용
		ArrayList <Integer> al = new ArrayList<>();
		
		//ArrayList 의 size가 6보다 작을 떄 까지
		while(al.size() < 6) {
			//1~45까지의 숫자를 랜덤하게 추출
			int su = r.nextInt(45)+1;
			//중복검사를 해서 통과하면 add하고 통과하지 못하면 add수행하지 않음
			if(al.contains(su)) {
				continue;
			}
			al.add(su);
		}
		al.sort(null);
		System.out.println(al.toString());
		
		//TreeSet : 중복된 데이터를 저장하지 않고 저장된 순서를 기억한다.
		TreeSet<Integer> treeSet = new TreeSet<>();
		while(treeSet.size() < 6) {
			//1~45까지의 숫자를 랜덤하게 추출
			int su = r.nextInt(45)+1;
			treeSet.add(su);
		}
		System.out.println(treeSet);
	}
}
