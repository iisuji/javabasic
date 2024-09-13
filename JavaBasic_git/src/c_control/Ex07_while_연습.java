package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while_연습 {

	public static void main(String[] args) {
		
		// [문제1] 숫자를 여러개 입력 받아 가장 큰 수 구하기 
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 입력(1 2 3 4) ->");
//		String str = input.nextLine(); // 사용자가 입력한 문자열을 받아 오세요 "1 2 3 4"
//		
//		StringTokenizer st = new StringTokenizer(str);
//		
//		int max=0;
//		while(st.hasMoreTokens()) {
//			String token = st.nextToken();
//			int su=Integer.parseInt(token); // 문자ㅏ열을 정수로 변환
//			if(max < su) {
//				max = su;}
//		}
//		System.out.println("큰 수 :"+  max);
		
		
		//[문제2] 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성
		// 입력 -  10 20 30 55 66 77 88 99 100 15
		// 출력 - 짝수 : 6개 
		//       홀수 : 4개
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력 ->");
		String str = input.nextLine(); // 사용자가 입력한 문자열을 받아 오세요
		
		StringTokenizer st = new StringTokenizer(str); 
		
		int even=0, odd=0;  // 초기식을 적어줍니다.
		while(st.hasMoreTokens()) {   // 단어가 남아있는지 확인 "토큰이 남아있니?"
			String token = st.nextToken(); // 토큰을 하나씩 빼서 비어있을 때까지 반복
			int su=Integer.parseInt(token);   // su = 내가 입력한 숫자 
			if(su%2==0) {
				even++;    // 짝수의 개수를 카운팅
			}else if(su%2==1) {
				odd++;     // 홀수의 개수를 카운팅
			}			
		}System.out.println("짝수:" + even + "개\n" + "홀수:" + odd+"개");
		
		
		
		// [방탈출문제]
		// 문제  : 8의 숫자 세기(구글입사문제)
		/*
		 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
		   8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
           (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)
		   결과 : 4000
		 */

		int count=0;
		for(int i=1 ; i<=10000 ; i++) {
			int su = i;						
			while(su!=0) {  //su가 0이 아닐 때까지 반복 
				int na = su%10;
				if(na==8) {
				  count++;
				}
				su=su/10;
			}					
		}System.out.println(count);
		

	}

}
