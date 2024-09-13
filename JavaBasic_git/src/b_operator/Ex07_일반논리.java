package b_operator;

public class Ex07_일반논리 {
	public static void main(String[] args) {
	
		int 성적=75;
		char 태도='A';  //(char이므로 문자 하나만 사용 가능)
		
		//우등생 기준   ---  or 연산자 사용 : 둘 중 하나만 true 여도 true
		if(성적>=80 || 태도=='A') {  //성적>=80 : false    태도=='A' : true
			System.out.println("성적이 80점 이상이거나 태도가 A라면 우등생입니다"); 
		}
		
		//성적향상반     and 연산자 사용 : 둘 다 true 이어야 true
		if(성적>=80 && 태도=='A') {
			System.out.println("성적이 80점 이상이고 태도가 A라면 성적향상반입니다");
		}
}
}


/*
  (직렬 / 병렬 스위치 생각할 것)
  
  논리연산자 (일반) 
  A&&B : 둘 다 True 일 때, True인 것
  A||B : 둘 중 하나만 True여도, True인 것 
  
	A	B		A && B		A || B
------------------------------------------
	F 	F	      F			  F
	F	T		  F			  T
	T 	F         F           T
	T	T         T           T
  
  
  
  논리연산자 (이진=비트연산자)
  (직렬 / 병렬 스위치 생각할 것)  
  
	A	B		A & B		A | B
------------------------------------------
	0 	0	      0			  0
	0	1		  0			  1
	1 	0         0           1
	1	1         1           1
	
 */
