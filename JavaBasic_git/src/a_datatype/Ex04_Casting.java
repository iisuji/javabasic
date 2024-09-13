package a_datatype;

/*
 [참고] 자료형
 
 1. 기본형
 	- 논리형 : boolean
 	- 문자형 : char(2Byte)
 	- 정수형 : byte(1B), short(2B), int(4B), long(8B) 
 	  //기본은 int형, 2억이 넘어가는 숫자는 long형
 	- 실수형 : float(4B), double(8B)
 
 2. 참조형 : 배열, 클래스 
 
 [기본]
 	변수의 자료형과 값의 자료형이 일치

 [참고]
 	변수의 자료형과 값의 자료형이 안 맞는 경우
 		- 변수의 자료형 > 값의 자료형 : 자동 해결 (---공간이 값보다 넒은 경우)
 		- 변수의 자료형 < 값의 자료형 : 자료형 변경(casting)
 
 */



public class Ex04_Casting {

	public static void main(String[] args) {
		
		float f; // 4B
		// f = 3.6; // 에러 발생(4B 공간에 8B가 들어감)
		f=(float)3.6; // (float) 넣어 casting을 해줘야 함 
		System.out.println("f=" + f);

		double d; // 8B
		d=100; // 공간(8B) = 4B값
		System.out.println("d=" + d);
		
		// 정수형변수 i에 36.99 실수 대입하고 출력 
		int i;
		i=(int)36.99;
		System.out.println("i="+i); // 실행하면 소수점 소실되고 정수 36만 남게됨
		
		int su;
		//su=10000000000; 100억 에러
		
		long big;
		big=10000000000L;
		System.out.println("큰수:"+big);
	}

}
