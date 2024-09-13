package a_datatype;

/*
 * 자바에서 콘솔 입력받는 방법
 * 		- java.util.Scanner 클래스 이용
 * 
 * 		- 정수형 입력시 : nextInt()
 * 		- 실수형 입력시 : nextDouble()
 * 		- 문자열 입력시 : next() / nextLine()   *** [숙제] 차이점은 무엇?
 * 			// 공통점은 둘 다 문자열로 반환시켜주고 차이점은 nextLine()메소드는 Enter를 치기 전까지 쓴 문자열 모두 반환한다는 것이고,
 * 			   next()메소드는 공백(space) 전까지 입력받은 문자열을 반환한다는 것이다.
 */

// [참고] 자주 사용하는 기본적인 클래스는 java.lang 패키지
// import java.lang.* ---> 이것을 제외하고는 다 import 해줘야 함

import java.util.*;

public class Ex09_Scanner {

	public static void main(String[] args) {
		
		int kor, eng, math;
		
		Scanner input = new Scanner(System.in);   // 입력을 받기 위한 통로를 만들어준다고 생각하자
		System.out.println("국어 점수 입력 ->");
		kor=input.nextInt();
		System.out.println("국어:"+kor);
		
		//영어점수 입력 받기, 수학 점수 입력 받기, 출력
		System.out.println("영어 점수 입력 ->");
		eng=input.nextInt();		
		System.out.println("영어:"+eng);
	
		System.out.println("수학 점수 입력 ->");
		math=input.nextInt();		
		System.out.println("수학:"+math);
		
		// 총점 구해서 출력
		int total;
		total=kor+eng+math;
		System.out.println("총점:"+total);
		
		// 평균 구해서 출력
		int avg;
		avg=total/3;
		System.out.println("평균:"+avg);
		
		
	}

}
