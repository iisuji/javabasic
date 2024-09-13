package a_datatype; //패키지명 : a_datatype

//주석 : 컴파일하지 않는 문장 (컴퓨터가 인식하는 문자가 아니라는 이야기)
// ---> 한 줄 주석
/*
     여러 줄 주석
 */

public class Ex01_Naming { // 클래스명 Ex01_Naming 

	public static void main(String[] args) {
		
		// 문자형 변수 ch 선언하기
		char ch; // 변수명 : ch
//		char ch1;
//		char ch_test;
//		char ch_$;
//		char CH;
// 한꺼번에 여러 개 주석 달기 : ctrl+/
		
		// char 2ch; // 에러발생(맨 앞에 숫자 금지)
		// char abstract;  // 에러발생(키워드 사용 금지)
		
		// 정수형 변수 abcdef 선언하기 
		int abcdef;
		
		// 실수형 변수 f 선언하기
		double f;
		
		// 논리형 변수 flag 선언하기
		boolean flag;
	}
}

/*
    [변수] 메모리 상에 값을 저장하기 위한 공간
    
    	자료형(datatype)	/ 변수명;
    	* 자료형
    	 [1] 기본형
    	 	- 논리형 : boolean
    	 	- 문자형 : char
    	 	- 정수형 : int
    	 	- 실수형 : double
    	 	
    	 [2] 참조형 : 배열 / 클래스
    	 
    	* 변수명 규칙
    		1 - 문자(한글,영어 등 모두 가능), 숫자, _ , $ 조합 
    		    (but, 가급적 $ 사용하지 말자)
    		2 - 숫자가 첫 글자이면 안됨
    		3 - 길이 제한 없음 
    		4 - 대소문자 구별
    		5 - 키워드 사용 안됨 (자바 예약어 사용 불가)

			[권장사항]
			1 - 클래스명은 대문자 시작
			2 - 변수명은 소문자 시작
			3 - 패키지명은 전부 소문자
			4 - 낙타표기법 (camel-case)
				[낙타표기법 예시]
				- 원을 그리는 클래스 : DrawCircle
				- 원을 그리는 변수 : drawCircle
				
				
 
 */

