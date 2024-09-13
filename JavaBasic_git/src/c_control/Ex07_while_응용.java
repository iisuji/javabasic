package c_control;

import java.util.Scanner;

/*
 * 
 * 		for문 : 반복횟수가 정해져 있는 경우 주로 사용 	
 * 		while문 : 반복횟수를 모를 때 주로 사용 
 * 
 * 
 * 		StringTokenizer : 문장을 쪼개줌 
 * 
 */

import java.util.*;

public class Ex07_while_응용 {

	public static void main(String[] args) {
		
		// 예 : 국어/영어/수학 -> 90/88/70
		Scanner input = new Scanner(System.in);  // 스캐너 입력문 입력하고 import 해오기 
		System.out.println("예 : 국어/영어/수학 -> 90/88/70 ->");
		String str = input.nextLine();
		//System.out.println(str);
		StringTokenizer st = new StringTokenizer(str, "/"); // 구분자 기본값 : 공백 
		
		// "/" 구분자를 기준으로 앞 뒤만 나뉘어 수를 잡게 되므로
		// 수를 직접 지정해준다.
		int cnt = st.countTokens();  
		 
		// 반복횟수 알 수 있다면
		for(int i=0 ; i<cnt ; i++ ) {
			String token = st.nextToken(); // 토큰을 하나씩 빼서 비어있을 때까지 반복 
			System.out.println("점수: " + token);
		}
				
		
		//  
//		while(st.hasMoreTokens()) {  // 단어가 남아있는지 확인 "토큰이 남아있니?" 단어가 존재하지 않는 것을 확인했을 때 벗어남			
//			String token = st.nextToken();
//			System.out.println("점수: " + token);
//		}
		
		
		
		
		
	} // end of main
	
} //end of class
