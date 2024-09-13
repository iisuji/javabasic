package e_method;

 // 함수는 무조건 불러주어야 한다. 

import java.util.*;
public class Ex07_연습 {

	public static void main(String[] args) {  // 메인 함수에 다 넣지 않고 역할별로 쪼개는 것 
		
		// 메인 함수에서 입력, 계산, 출력 메소드 호출 
		int [] score = input(); // 메소드를 호출하여 점수 배열을 입력받습니다.
		double avg = calculate(score); // score를 인자로 전달  // 메소드를 호출하여 총점과 평균을 계산하고, 평균을 반환받습니다.
		output(avg); // 평균을 인자로 전달 // 메소드를 호출하여 평균을 바탕으로 학점을 출력합니다. 
	}
	
	// 국어, 영어, 수학 점수를 입력받는 메소드 
	static int[] input() {   // input() --> 주는 인자가 비어있으므로 받는 파라미터도 비어 있음  
		
		int [] score = new int[3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수 -> "); 
		score[0] = input.nextInt();
		System.out.println("영어점수 -> ");
		score[1] = input.nextInt();
		System.out.println("수학점수 -> ");
		score[2] = input.nextInt();
		
		return score; // 입력된 점수 배열을 반환, 값 하나만 리턴할 수 있으므로 배열 사용 
	}

	// 입력 받은 점수들로 총점 / 평균 구해서 출력
	static double calculate(int [] score) {  // score 파라미터로 받음 --> int배열 넘겨받아 double형으로 리턴해라
		int total = 0;
		double avg=0.0; 
		
		for(int i=0; i<score.length; i++) {
			total += score[i]; // 점수 배열의 각 요소를 총점에 추가 
		}
		
		avg=total/(double)3;  // 형변환 // 총점을 3으로 나누어 평균 계산    
		System.out.println("총점 : " + total + ", 평균 : " + avg);
		
		return avg; // 평균값을 반환 
	}
	
	
	// 평균을 바탕으로 학점을 출력하는 메소드  
	static void output(double avg) {
		switch((int)avg/10) {  // 평균을 정수형으로 변환 후 10으로 나누어 학점 판별 (switch는 정수만 들어가므로 형변환)
		case 10 : 
		case 9 : System.out.println("A학점"); break;
		case 8 : System.out.println("B학점"); break;
		default : System.out.println("F학점"); 
		
		}
	}
	
	
}
