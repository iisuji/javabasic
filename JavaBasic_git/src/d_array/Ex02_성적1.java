package d_array;

import java.util.*;
public class Ex02_성적1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Scanner 객체 생성
		System.out.println("학생수를 입력하세요 -> ");
		int su = input.nextInt(); // 사용자가 입력한 정수를 변수 su에 저장
		
		int[] kor = new int[su];  // 사용자가 적은 개수에 맞춰[su] 배열 생성
		
		//for 루프를 사용하여 배열 kor의 모든 인덱스를 순회한다. 
		for(int i=0; i<kor.length; i++) { // i=현재 학생의 인덱스. 0부터 배열의 마지막 인덱스까지 반복
			System.out.println(i+"번 학생의 국어점수를 입력하세요 -> ");
			kor[i] = input.nextInt();  // 입력한 i번 학생의 점수를 배열에 저장 
		}
		
		// 총점 구하기
		int total = 0;
		
		for(int i=0; i<kor.length; i++) { // i<사용자가 적은 개수만큼 루프 돌리기 
			total += kor[i];  // kor[i] 배열에 담긴 각 객체 i들을 모두 더해준다. 
		}
		
				
		// 총점과 평균 출력 
		System.out.println("총점:" + total);
		System.out.println("평균:" + total/kor.length);
		
		
		
		

	}

}
