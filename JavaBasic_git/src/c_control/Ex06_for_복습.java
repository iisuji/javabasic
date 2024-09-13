package c_control;

import java.util.Scanner;

public class Ex06_for_복습 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  // 스캐너 입력문 입력하고 import 해오기 
		System.out.println("숫자를 입력하세요 -> "); // "숫자를 입력하세요->" 문구 입력 
		int su=input.nextInt();
		
		// 3행 3열짜리 별표 찍고, 숫자로 변경한 후 공백 추가 ---> 순차적 방법으로 생각해보기 
		
		for(int i=0 ;i<su ; i++) {  // 행(row)
			// 1. 공백을 추가 
			for(int j=0 ; j<su-i-1 ;j++ ) {
				System.out.print(' ');
			}
			// 2. 
			for(int j=1; j<=i+1; j++) { //문자(열:column)
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
