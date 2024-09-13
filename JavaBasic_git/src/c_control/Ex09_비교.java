package c_control;

import java.util.Scanner;

public class Ex09_비교 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
				
		// --------------[1] for 이용
//		System.out.println("구구단 출력 몇 번 반복할까요?");
//		int su = input.nextInt();
//		
//		// 몇 번 반복할 지 안다면 for문 쓰는 게 좋음 
//		for(int a=0; a<su ; a++) {  
//	
//		System.out.println("단 입력 -> "); // "단 입력->" 문구 입력 
//		int dan=input.nextInt();
//		for(int i=1 ; i<=9 ; i++ ) {
//			System.out.printf(" %d * %d = %d \n", dan, i, dan*i);  
//		}
//		}
		
		
		// --------------[2] while 이용
		// 몇 번 반복할 지 알 수 없다면 while문 이용 (언제 끝낼지 사용자의 마음을 알 수 없음)
	
	while(true) {
		System.out.println("단 입력 -> "); // "단 입력->" 문구 입력 
		int dan=input.nextInt();
		for(int i=1 ; i<=9 ; i++ ) {
			System.out.printf(" %d * %d = %d \n", dan, i, dan*i);  
		}
		System.out.println("종료할까요?(Y/N)");
		String answer = input.next();  // ---> nextLine() 사용하면 안 됨  //이전 버퍼에 남은 엔터값이 개행되며 처리됨
		if(answer.equals("Y") || answer.equals("y")) break;  // 문자열 비교는 .equals 사용 
	}
		
	
	// --------------[3] do ~ while 이용
	// while 문은 무조건 반복을 시켰지만, do~while문은 반복을 어떻게 할까요?임

	String answer="0";
	do {
		System.out.println("단 입력 -> "); // "단 입력->" 문구 입력 
		int dan=input.nextInt();
		for(int i=1 ; i<=9 ; i++ ) {
			System.out.printf(" %d * %d = %d \n", dan, i, dan*i);  
		}
		System.out.println("다시할까요?(Y/N)");
		answer = input.next();  // ---> nextLine() 사용하면 안 됨  
	}while(answer.equals("Y") || answer.equals("y"));
		

		
		
	}

}
