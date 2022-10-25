package api.util.generic;

import java.util.Arrays;

public class CollectionTest1 {
	public static void main(String[] args) {
		String[] ar = {"List", "Set", "Map"};
		
		ar[2] = "HashTable";
		System.out.println(Arrays.toString(ar));
		
		//ar 배열에 데이터를 추가
		//ar 배열보다 1개 더 큰 공간을 갖는 배열 생성.
		String[] br = new String[ar.length+1];
		//ar의 내용을 복사
		for(int i =0; i<ar.length;i++) {
			br[i] = ar[i];
		}
		//br의 마지막에 데이터 추가
		br[br.length -1 ] = "Properties";
		//br이 가리키는 곳을 ar이 가리키도록 한다.
		ar = br;
		System.out.println(Arrays.toString(ar));
		
		//연습 : Set(1번째데이터)을 삭제하기
		
		
	}
}
