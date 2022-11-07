package api.util.generic;

import java.util.ArrayList;
import java.util.List;

public class CollectiongEx {
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		
		List<Integer> list2= new ArrayList<>();
		
		list.add(11);
		list.add(5);
		list2.add(1);
		list2.add(9);
		list.addAll(list2);
		System.out.println(list);
		list.get(0);
		System.out.println(list);
		System.out.println(list.size());
		int a = 2;
		list.forEach(b -> {
			System.out.println(a);
		});
		
		
	}
}
