package c_exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Product prd = new Product();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("상품번호를 입력하세요 -> ");
		prd.setPoductNo(input.nextLine());
		
		System.out.println("상품명을 입력하세요 -> ");
		prd.setProductName(input.next());
		
		System.out.println("초기 재고량을 입력하세요 -> ");
		prd.setStock(input.nextInt());
		System.out.println(); //개행
		
		System.out.println("판매량을 입력하세요 ->");
		prd.sale(input.nextInt());
		prd.output();
		System.out.println(); //개행
		
		System.out.println("입고량을 입력하세요 ->");
		prd.income(input.nextInt());
		prd.output();
			
	}
	
		

}
