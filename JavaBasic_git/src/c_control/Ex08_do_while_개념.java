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
			
			초기치;
			do{
				반복문장;
				증가치;
			}while(조건문)	---> while 조건문 비교를 젤 나중에 
				
			
 */
public class Ex08_do_while_개념 {

	public static void main(String[] args) {
		
		// 1부터 10까지의 합 
//		int sum=0;  //초기화
//		int i=1;
//		do{
//			sum+=i;
//			i++;
//		}while( i<=10 );
//		System.out.println("합 : " + sum);
		
		
		// for ---> while ---> do ~ while 형식으로 변경해가며 연습해보기 
		
		// 단 수를 입력받아 구구단 출력 (do~while 구문) 
		Scanner input = new Scanner(System.in);  // 스캐너 입력문 입력하고 import 해오기 
		System.out.println("단 입력 -> "); // "단 입력->" 문구 입력 
		int dan=input.nextInt();
		// [ex] 2 * 1 = 2
		//       
		//      2 * 9 = 18
		
		// Ex07_while_개념의 while문을 do~while문으로 변경 
		int i=1;  // for에서의 초기치 
		
		do { 
		System.out.printf(" %d * %d = %d \n", dan, i, dan*i);  
			//printf는 개행이 안 됨, \n 넣어서 개행해주기 
			i++; // for에서의 증가치  
		}while( i<=9 );	// for에서의 조건문
		
	
	}
	
}
