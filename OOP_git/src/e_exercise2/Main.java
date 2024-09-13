package e_exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//예금주, 계좌번호, 초기 잔액을 입력받아 은행계좌(Account) 클래스를
		//객체 생성할 때 지정한다. 
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("예금주 입력 -> ");
		String holder=input.next();
		System.out.println("계좌번호 입력 -> ");
		String account=input.next();
		System.out.println("초기 잔액 입력 -> ");
		int balance=input.nextInt();
		
		Account acc = new Account(holder, account, balance);
		// 초기화 한 값을 전달 
		
		acc.Output();
		
		//인출 후에 결과 확인을 출력한다.
		System.out.println("인출할 금액 입력 ->");
		acc.getWithdraw(input.nextInt());
		acc.Output();
		System.out.println(); //개행
		
		//입금 후에 결과 확인을 출력한다.	
		System.out.println("입금할 금액 입력 ->");
		acc.getDeposit(input.nextInt());
		acc.Output();
		System.out.println(); //개행
		
	}

}
