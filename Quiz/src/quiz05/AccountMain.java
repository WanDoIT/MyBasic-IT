package quiz05;

public class AccountMain {
public static void main(String[] args) {
	
	Account myAcc= new Account ("홍길동","1234",3600);
	
	myAcc.deposit(800);
	myAcc.withDraw(1900);
	
	int bal = myAcc.getBalance();
	System.out.println(myAcc.name + "님의 계좌 잔액은 : "+bal+"원입니다.");
	
	MyAccount nAcc = new MyAccount("철수","1324",5000);
	
	
	nAcc.deposit(1000);
	System.out.print("출금 비밀번호 입력>");
	nAcc.withDraw(6500);
	
	int nBal= nAcc.getBalance();
	System.out.println(nAcc.name+"님의 계좌 잔액은 "+nBal+"원입니다.");
	
}
}
