package c_control;

import java.util.*;

public class Ex05_for_연습 {

	public static void main(String[] args) {
		/*
		 * 문제 1)
		 *  1~ N까지의 숫자를 다음처럼 출력하라

			1  2  3  4  5 
			6  7  8  9  10
			11 12 13 14 15
		 
		 */
		
//		for(int i=1; i<=15; i++) {
//			System.out.print(i+" ");
//			if(i%5==0) {
//				System.out.println(); // 개행 
//			}	
//		}
		
		/* 문제 2) 
		 * 문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
		   N이 대문자이면 문자 N부터  Z까지 출력하라 
		   그 밖의 문자가 입력되면 Error 를 출력하라 
		   
		   입력    출력

  			f   abcdef
			X   XYZ
			6   Error 
		 
		 */
		
//		Scanner input=new Scanner(System.in);  // 스캐너 입력받기 위한 통로
//		System.out.println("문자 하나를 입력하세요 -> ");
//		  // char input = (char)input.nextInt();  ---> 오류 : 자료형 매칭문제됨
//		
//		char ch = input.next().charAt(0);  //문자(ch) 하나를 입력하세요.
//		
//		// 소문자인지 여부 판단 
//		if(ch>='a' & ch<='z') {    // 만약 문자 'a' ~ 'z' (소문자)라면 
//			for(char i='a' ; i<=ch ; i++) {  // i가 'a'일 때, i를 입력한 문자(ch)까지 하나씩 올리며 출력
//				System.out.print(i);
//			}
//		}else if(ch>='A' & ch<='Z') {  // 만약 문자 'A' ~ 'Z' (대문자)라면
//			for(char i=ch ; i<='Z'; i++) {  // i가 입력한 문자(ch)일 때, 입력한 문자부터 'Z'까지 하나씩 올리며 출력
//				System.out.print(i);
//			}
//		}else {
//			System.out.println("Error"); // 그 밖의 문자는 Error 출력 
//		}
		
		
		/*
		 * 
		문제3 ) 입력받은 문자열의 뒤집어서 출력하세요.
		[예]  입력 -> 출력
		  	 안녕 친구  -> 구친 녕안
  			 CarpeDiem  -> meiDepraC 
		[힌트] 문자열의 길이 구할 때   length() 이용
		
		*/
		
		Scanner input=new Scanner(System.in);
		System.out.println("문자열을 입력하세요 -> ");
		String ch = input.nextLine();
		
		// 입력한 문자열의 길이를 출력한다 
		int leng = ch.length();
			//System.out.println(leng);
		
		String str="";
		
		for(int i=leng-1 ; i>=0 ; i-- ) {  //4 3 2 1 0   // 
			// 요세하녕안
			// 1. str에 저장  2. str이 문자 단어 하나씩 저장  3. 더하기 사용  
			str = str+ch.charAt(i);  //문자열에서 i 자리에 있는 글자를 추출해서 차례로 더해준다. 
		}
		System.out.println(str);
		
		
		// 문제에서 '거꾸로' ---> 마이너스 (-) 사용, 줄어드는 의미로 받아들이기! 
		
		

	}

}
