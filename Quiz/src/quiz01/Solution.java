package quiz01;

class Solution {
	public int solution(int[][] board) {
		int answer = 0;
		
		int[][] arr = new int[board.length+2][board[0].length+2];
		for(int i =0; i<board.length;i++) {
			for(int j =0; j<board[i].length; j++) {
				if(board[i][j]==1) {
					arr[i][j] = 1;
					arr[i][j+1] = 1;
					arr[i][j+2] = 1;
					arr[i+1][j] = 1;
					arr[i+1][j+1] = 1;
					arr[i+1][j+2] = 1;
					arr[i+2][j] = 1;
					arr[i+2][j+1] = 1;
					arr[i+2][j+2] = 1;
				}
			}
		}
		for(int i =1; i<arr.length-1; i++) {
			for(int j=1; j<arr[i].length-1;j++) {
				if(arr[i][j]==0) {
					answer++;
				}
				
			}
		}
		return answer;
	}
}