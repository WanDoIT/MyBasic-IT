package api.util.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {
	public static void main(String[] args) {
		//문자열을 저장하는 Set 인스턴스를 3개 생성
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		//샘플데이터 삽입.
		hashSet.add("a");
		linkedHashSet.add("a");
		treeSet.add("a");
		hashSet.add("b");
		linkedHashSet.add("b");
		treeSet.add("b");
		hashSet.add("1");
		linkedHashSet.add("1");
		treeSet.add("1");
		hashSet.add("2");
		linkedHashSet.add("2");
		treeSet.add("2");
		hashSet.add("c");
		linkedHashSet.add("c");
		treeSet.add("c"); // Set은 중복데이터 두번저장 안함.
		//데이터 출력
		//HashSet : 어떤 순서로 출력될 지 예측할 수 없음
		for(String a : hashSet) {
			System.out.print(a+"\t");
		}
		System.out.println();
		
		//LinkedHashSet : add한 순서대로 출력됨
		for(String a : linkedHashSet) {
			System.out.print(a+"\t");
		}
		System.out.println();
		
		//TreeSet : 정렬한 순서대로 출력되는데 순자가 영문자보다 작고 대문자가 소문자보다 작음.
		for(String a : treeSet) {
			System.out.print(a+"\t");
		}
		System.out.println();
		
		
		
		
		
		
	}
}
