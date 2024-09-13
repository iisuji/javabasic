package c_control;

public class Ex06_for중첩_알파벳 {

	public static void main(String[] args) {
			
//	for( int i=0 ; i<26 ; i++ ) {	// 26줄 출력하는 반복문
//		for(char ch='A' ;ch<='Z' ;ch++ ) {  // 알파벳 출력하는 반복문
//			System.out.print(ch);
//		}
//		System.out.println(); //개행 
//	}
	
	//[문제1] A~Z 한 줄에 하나씩 늘어나는 알파벳 	
//	for( int i=0 ; i<26 ; i++ ) {	// 26줄 출력하는 반복문
//		for(char ch='A' ;ch<='A'+i ;ch++ ) {  // 늘어나는 변수는 i이므로 i를 활용하여 식을 만들어준다. 
//			System.out.print(ch);
//		}
//		System.out.println(); //개행 
//	}
	
	
	// [문제2] A~Z 한 줄에 하나씩 줄어드는 알파벳(뒷자리가 하나씩 사라짐) 

//	for(int i=0 ; i<26 ; i++) {
//		for(char ch='A'; ch<='Z'-i; ch++) {
//			System.out.print(ch);
//		}
//		System.out.println();
//	}
	
	// [문제3] Z~A 거꾸로 한 줄에 하나씩 늘어나는 알파벳 
	
	for(int i=0; i<26; i++) {  // 26줄을 만들겠다 
		for(char ch='Z'; ch>='Z'-i ; ch--) {  // 한 번 돌릴 때마다 1줄씩 생성 
			System.out.print(ch);
		}
		System.out.println();
	}
	
	// [문제4] A~Z 에서 하나씩 줄어드는데, 앞에 알파벳부터 줄어듦
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ
	// BCDEFGHIJKLMNOPQRSTUVWXYZ
	// CDEFGHIJKLMNOPQRSTUVWXYZ
	// ... Z
	
//	for(int i=0; i<26; i++) {	
//		for(int ch='A'+i; ch<='Z' ; ch++ ) {   //여기에서 casting할 거라면, casting은 단항연산자라서 char ch=(char)('A'+i) ---> 괄호로 묶어줘야함 
//			System.out.print((char)ch);
//		}
//		System.out.println();
//	}

		
		
		

	
	}

}
