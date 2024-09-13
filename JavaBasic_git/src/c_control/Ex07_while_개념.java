package c_control;

import java.util.Scanner;

/*
 * 		반복문
 * 			- for문
			- while문
			- do ~ while문
			
			
			for(초기치 ; 조건문 ; 증가치){
				반복문장;
			}
			
			
			초기치;
			while(조건문){
				반복문장;
				증가치;
			}
			
 */

public class Ex07_while_개념 {

	public static void main(String[] args) {
		
		
		// for문 활용한 1부터 10까지의 합 
//		int sum=0;  //초기화
//		
//		for(int i=1 ;i<=10 ; i++) {
//			sum+=i;
//		}
//		System.out.println("합 : " + sum);
		
		
		// for문과 while문의 차이점
//		int sum=0;  //초기화
//		int i=1; // 초기치는 위로 옮김
//		
//		while(i<=10) {
//			// for( ; i<=10 ; ) --> 이렇게 조건문만 남게 된다. 
//			// 세미콜론 지우면 에러, while로 변경해준다. 조건문만 남는 게 while문
//			sum+=i;
//			i++; //증가치는 마지막에 위치
//		}
//		System.out.println("합 : " + sum);
	
		
		// 단 수를 입력받아 구구단 출력
		Scanner input = new Scanner(System.in);  // 스캐너 입력문 입력하고 import 해오기 
		System.out.println("단 입력 -> "); // "단 입력->" 문구 입력 
		int dan=input.nextInt();
		
		// [ex] 2 * 1 = 2
		//       
		//      2 * 9 = 18
		
		
		// for문으로 작성
//		for(int i=1 ; i<=9 ; i++ ) {
//			System.out.printf(" %d * %d = %d \n", dan, i, dan*i);  
//				//printf는 개행이 안 됨, \n 넣어서 개행해주기 
//		}
		
		
		// while문으로 작성
		int i=1;  // for에서의 초기치 
		
		while( i<=9 ) {  // for 조건문
		System.out.printf(" %d * %d = %d \n", dan, i, dan*i);  
			//printf는 개행이 안 됨, \n 넣어서 개행해주기 
			i++; // for에서의 증가치  
		}	
		
		
		
		
		
		

	}// end of main

}// end of class
