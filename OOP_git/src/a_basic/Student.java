package a_basic;
	
/*
 *		클래스 이름과 java 파일명이 동일
 *  	 - 대소문자 구별
 *  
 *  	[권장] 클래스 이름은 대문자로 시작 
 * 
 */

public class Student {
	
		// member fields : 멤버변수들 ( 서로 다른 자료형 가능 )
		String name;
		int kor, eng, math; 
		int total;
		double avg; 
	
		// member methods : 멤버함수들 
		int calTotal() {
			total = kor + eng + math;
			return total;
		}
		double calAvg() {
			avg = (double)total / 3;
			return avg; 
		}
	
	}

