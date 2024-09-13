package e_exercise2;

public class Account {

	//멤버변수
	 private String holder; //예금주
	 private String account; //계좌번호
	 private int balance; //잔액
	
	 // 생성자 - 클래스 초기화? 
	 public Account(String holder, String account, int balance) {
		 this.holder=holder;
		 this.account=account;
		 this.balance=balance;
	 }

	
	//인출 메소드
	//인자로 인출할 금액 받고,
	//잔액 부족시 "잔액이 부족합니다" 메시지 출력 / 충분할시 인출한 금액 출력
		
	 public void getWithdraw(int money) {
		 balance=balance-money;	
		
	 }
	 
	
	//입금 메소드 
	//인자로 입금할 금액 받고,
	//입금액을 잔액에 더하고 입금한 금액을 출력 
	
	 public void getDeposit(int money) {
		balance=balance+money;
	}
	
	
	//정보출력
	//예금주: 자바맨, 계좌번호: 123-456, 잔액:1000원
	public void Output(){
		 if(balance<0){
			 System.out.println("잔액이 부족합니다");
			 }else{
			 int balance;
		}
		System.out.println("예금주: "+ holder + ", 계좌번호: " +account + ", 잔액:" +balance);
	}
	
	
}
