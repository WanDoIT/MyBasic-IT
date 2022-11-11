package quiz;

public class Q6_23 {
	/*
	(1) max . 메서드를 작성하시오
	*/
	static int max(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr.length ==0 || arr.equals(null)) {
				max = -999999;
			} else if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		return max;
	}

	public static void main(String[] args)
	{
	int[] data = {3,2,9,4,7};
	System.out.println(java.util.Arrays.toString(data));
	System.out.println("최대값 :"+max(data)); 
	System.out.println("최대값 :"+max(null)); 
	System.out.println("최대값 :"+max(new int[]{})); // 0 최대값 크기가 인 배열
	}
	}

