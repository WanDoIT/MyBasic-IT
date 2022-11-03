class QuizEx5_7 {
	public static void main(String args[]) {

		// 문자열을 숫자로 변환한다 입력한 값이 숫자가 아닐 경우 예외가 발생한다
		int money = 3170;
		System.out.println("money=" + money);
		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			/*
			 * (1) . 아래의 로직에 맞게 코드를 작성하시오 
			 * 1.금액 을 동전단위로 나눠서 필요한 동전의 개수 를 구한다
			 * 2. coin coinNum . 배열 에서 만큼의 동전을 뺀다 ( coin .) 만일 충분한 동전이 없다면 배열 에 있는 만큼만
			 * 뺀다 
			 * 3. (coinNum) . 금액에서 동전의 개수 와 동전단위를 곱한 값을 뺀다
			 */
			for(int j =coin[i]; j>0; j--) {
				if(money-coinUnit[i]<0) {
					break;
				}
				money -= coinUnit[i];
				coinNum++;
			}
			System.out.println(coinUnit[i] + "원 : " + coinNum);
			coin[i] = coin[i] - coinNum;
			if(money==0) break;
		}
		if (money > 0) {
			System.out.println(" 거스름돈이 부족합니다.");

		}
		System.out.println("=남은 동전의 개수 =");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + coin[i]);
		}
	} // main
}