package api.util.generic;

public class Test {
	public static class Algorithm<T>{
		//2개의 데이터를 받아서 내용을 변경하는 메서드
		
		public void swap(T n1, T n2) {
			System.out.println(n1);
			T temp = n1;
			n1 = n2;
			n2 = temp;
			System.out.println(n1);
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2};
		a[3] = 2;
	}

}
