package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_야구게임 {

	public static void main(String[] args) {

		
		//---------------------------
		// 1. 임의의 수 3개 baseball에 저장 
		
		int [] baseball = new int[3];
		
		for(int i=0 ; i<baseball.length; i++) {  // 배열의 길이만큼 반복 
			baseball[i]=(int)(Math.random()*10); // 루프하는 동안 10까지의 랜덤숫자를 배열 i에 담는다  
			for(int j=0; j<i; j++) { // 현재 i 위치 이전의 모든 요소와 비교 
				if(baseball[j]==baseball[i]) {  //중복된 숫자가 있는지 확인
					i--; //중복된 경우, i를 감소시켜서 현재 인덱스에 다시 숫자를 할당하도록 함
				}
			}
			System.out.println(baseball[i]+"/"); // 현재 배열의 i번째 값을 출력
		}
		
		// baseball 값 출력 
		for(int i=0; i<baseball.length; i++) {
			System.out.print(baseball[i]+" ");
		}
		
		
		
		//--------------------------------
		//2. 사용자 입력값 answer에 각각의 숫자로 저장
		// [ex] 3 4 5
		
		int[]answer = new int[3];
		
		//구문작성
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력(1 2 3) ->");
		String input_str = input.nextLine();
		StringTokenizer st = new StringTokenizer(input_str);
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(st.nextToken());
		}
		
		
//		//answer 값 출력
//		for(int i=0; i<answer.length; i++) {
//			System.out.println(answer[i]+" ");
//		}
		
		
		//-----------------------------------
		// 3. 값 비교
		int strike=0, ball=0;
		for(int i=0; i<baseball.length; i++) {
			for(int j=0; j<answer.length; j++) {
				if(baseball[i] == answer[j]) {  //자리수까지 같으면
					if(i==j) {
						strike++;
					}else ball++; 
					
				}
			
			}
		}
		
		// 4. 출력
		System.out.println("스트라이크 : " + strike + " / 볼 : " + ball);
		
		//반복
		
		
	}

}




/*
 * 
 * 	while문으로 스트라이크가 3이면 종료
 * 틀리면 무 
 * 
 * 
 * */
 