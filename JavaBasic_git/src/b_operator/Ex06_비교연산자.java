package b_operator;

/*
 *  비교연산자
 *  
 *  > >= < <=   ==  !=
 * 
 * */

public class Ex06_비교연산자 {
public static void main(String[] args) {
	
	int kor=89, eng=87, math=77;
	
	//총점, 평균을 구해서 변수에 저장하고 출력
	
	int total = kor+eng+math;  // 국어, 영어, 수학점수를 더해서 total이라는 변수에 넣어주세요.
	System.out.println("총점:"+total);
	
	double avg = (double)total / 3;    
		// 정수, 정수의 결과값은 항상 정수로 표현된다. 그래서 total, 3 둘 중에 한 곳을 실수로 표현해주면 되는데,
	 	// 과목 수는 3으로 고정이므로 total 앞에 형변환을 해주어 이쪽을 변경해주는 편이 좋다. 
		// 실수는 정수형 변수인 double에 들어갈 수 없으므로 형변환
	System.out.println("평균:" + avg);
	
	
	/*
	 * [학점구하기]
	 * 
	 * 평균이 90점 이상이면 A학점
	 * 평균이 80 이상 90 미만이면 B학점
	 * 평균이 70 이상 80 미만이면 C학점
	 * 
	 */
	
	
	// 맞는 경우 : 이 유형의 경우 아래대로 진행할 것 
	
	if(avg >= 90) {  					// 만약에 avg 값이 90 이상이라면
		System.out.println("A학점");		// 그렇다면 'A' 학점 출력 
	}else if(avg >=80) {				// 그렇지 않다면(90 미만이라면) 만약에 avg값이 80 이상이라면
		System.out.println("B학점");		// 그렇다면 'B' 학점 출력
	}else if(avg >=70) {				// 그렇지 않다면 (80 미만이라면) 만약에 avg값이 70 이상이라면
		System.out.println("C학점");		// 그렇다면 'C' 학점 출력 
	}
	
	
	/*
	 *** 틀린 경우 : 점수 낮은 수부터 진행하면 오류 
	 
	if(avg >= 70) {  					
		System.out.println("C학점");		
	}else if(avg >=80) {				
		System.out.println("B학점");		
	}else if(avg >=90) {				
		System.out.println("A학점");		
	}
	
	*/
	
	
	/*
	*** 틀린 경우 : else (그렇지 않다면,)이 빠지면 틀림!! 
	
	if(avg >= 90) {  					// 만약에 avg 값이 90 이상이라면
		System.out.println("A학점");		// 그렇다면 'A' 학점 출력 
	}
	if(avg >=80) {						// 만약에 avg값이 80 이상이라면
		System.out.println("B학점");		// 그렇다면 'B' 학점 출력
	}
	if(avg >=70) {				// 
		System.out.println("C학점");		// 
	}
	*/
	
	

	
}
}
