package b_operator;

import java.util.Scanner;

public class Ex10_삼항복습 {

	public static void main(String[] args) {
		
		// 두 수 중에서 큰 수를 출력
		/*
		int a = 15, b = 40;
		
		int max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		System.out.println("두 수 중 큰 수는 " + max);
		*/
		
		// 두 수를 입력받고 그 두 수 중에서 큰 값 출력 (삼항연산자 이용) 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 숫자->");
		int first = input.nextInt(); //사용자가 입력한 정수를 읽어옵니다.
		
		System.out.println("두번째 숫자->");
		int second = input.nextInt(); // 사용자ㅏ 입력한 정수를 읽어옵니다. 
		
		int max = (first > second) ? first : second;
		System.out.println("둘 중 큰 수는 " + max);
		
		
		
		
	}
}