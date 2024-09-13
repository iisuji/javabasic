package b_operator;

public class Ex08_이진논리 {
	public static void main(String[] args) {
	
		int a=15;  		// 00000000 00000000 00000000 00001111
		int b=10;  		// 00000000 00000000 00000000 00001010
		
		int and = a&b;  // 00000000 00000000 00000000 00001010
		System.out.println("and=" + and);
		
		int or = a|b;   // 00000000 00000000 00000000 00001111
		System.out.println("or=" + or);
		
		int xor = a^b;   // 00000000 00000000 00000000 00000101
		System.out.println("xor=" + xor);
	}
}



/*  (사용하는 일 거의 없음, 일반논리만 알아둘 것) 
 
논리연산자 (이진=비트연산자)
(직렬 / 병렬 스위치 생각할 것)  

	A	B		A & B		A | B		A ^ B (입력신호가 서로 다를 때만 입력)
------------------------------------------------
	0 	0	      0			  0			  0
	0	1		  0			  1			  1
	1 	0         0           1			  1
	1	1         1           1			  0
	
*/