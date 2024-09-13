package b_operator;

import java.util.Scanner;

public class HW_02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 숫자->");
		int a = input.nextInt();
		
		System.out.println("두번째 숫자->");
		int b = input.nextInt();
		
		System.out.println("세번째 숫자->");
		int c = input.nextInt();
		
		int max;
		if (a>b && a>c) {
			max=a;
		}else if (b>a && b>c) {
			max=b;
		}else {
			max=c;
		}
		System.out.println("세 수 중 가장 큰 수는 = " + max);
		
	}
}
