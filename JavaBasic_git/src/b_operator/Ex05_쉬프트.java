package b_operator;
/*
shift : 모든 비트의 값을 이동하는 연산자 (알아두기만 할 것, 잘 쓰이지 않음)
	>>  오른쪽으로 이동
	<<  왼쪽으로 이동
	>>>
	
	숫자 2를 1Byte 적용한다면?
	
	2 		 00000010    
	2<<1	 00000100
	2>>1	 00000001 (2를 기준으로 오른쪽으로 1칸씩 이동) 
	
	2>>>1 	 00000001
			 음수인 경우
			 10000010   -->  01000001
	
*/

public class Ex05_쉬프트 {
public static void main(String[] args) {
	
	int a = 4;			  // 00000000 00000000 00000000 00000100
	int result = a >> 2;  // 00000000 00000000 00000000 00000001 
	System.out.println("a>>2한 결과:" + result);
	
	int result2 = a << 2; // 00000000 00000000 00000000 00010000 
	System.out.println("a<<한 결과:" + result2); 
	
	int b = -4;  // 음수는 양수와 계산법이 다름. 따로 기억할 필요는 없음, 안 중요함 
	int re1 = b >> 2;
	System.out.println("b>>2한 결과:" + re1);
	
	int re2 = b >>> 2;
	System.out.println("b>>2한 결과:" + re2);
	
	
}
}
