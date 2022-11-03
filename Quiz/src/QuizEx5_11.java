
public class QuizEx5_11 {
	public static void main(String[] args) {
		int[][] score = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				/*
				 * (1) . 알맞은 코드를 넣어 완성하시오
				 */
				result[i][j]=score[i][j];
				if(j==2) {
					result[i][j+1] = score[i][0]+score[i][1]+score[i][2];
				}  
				if(i==4) {
					result[i+1][j]= score[0][j]+score[1][j]+score[2][j]+score[3][j]+score[4][j];
				} 
				if(j==2&&i==4) {
					result[5][3] = result[5][0]+result[5][1]+result[5][2];
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	} // main
}