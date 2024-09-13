package a_datatype;

public class Ex03_연습 {
public static void main(String[] args) {

	//국어점수 변수 선언
	int kor; 
	 //영어점수 변수 선언
	int eng;
	
	//국어점수 변수에 90점 지정
	kor=91;
	//영어점수 변수에 100점 지정
	eng=100;
	
	//총점 변수 선언
	int total;
	//총점 계산하기
	total=kor+eng;
	
	//총점 출력
	System.out.println("총점:"+total);
	
	//-----------------------------
	//평균을 구해서 출력 
	
	//평균 변수 선언
	double avg;
	//평균 계산하기
	avg=total / 2.0; //그리고 계산식 뒤에도 ';' 잊지 말것!
			// 191/2 = 95.5
	   		// 정수형끼리 연산한 결과는 정수형임, 소수점으로 나오지 않음! (**자바 특징**)
	        // 나누는 숫자 '2'를 실수형으로 만들어주면 됨 '2.0'
	System.out.println("평균:"+avg);
	
	
	
}
}
