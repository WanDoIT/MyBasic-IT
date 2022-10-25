package quiz01;

public class Quiz15 {
	public static void main(String[] args) {
		//힌트 출력은 가로 or 세로로만 가능함
		//정렬은 \t -> 8칸 띄어쓰기
		for (int i = 1; i <10;i+=3) {

			for(int j = 1; j<10; j++) {
				System.out.print(i+" X "+j+" = "+i*j + "\t");
				System.out.print((i+1)+" X "+j+" = "+(i+1)*j + "\t");
				System.out.print((i+2)+" X "+j+" = "+(i+2)*j + "\t");
				System.out.println();

			}

			System.out.println();
		}
	}
}


