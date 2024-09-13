package e_method;
// 동일한 이름의 함수가 여러개인 경우 인자를 맞춰서(형, 개수) 찾아간다. 
public class Ex08_연습 {

	public static void main(String[] args) {
		multiple(2, 3);
		multiple(4, 'ㅋ');
		multiple(2, 3, 'ㅋ');
	}
	static void multiple(int a, int b) {
		System.out.println(a*b);
	}
	static void multiple(int a, char ch) {
		for(int i=0; i<a ; i++) {
			System.out.print(ch);
		}
		System.out.println();  // 개행
		System.out.println();  // 한 줄 더 띄움
	}
	
	
	static void multiple(int n, int m, char ch) {
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	
}


/*
 * 	multiple 메소드 만들기
 *  - 2개의 int 인자인 경우는 곱셈 계산 한 결과를 출력
 *  - 1개의 int 인자와 1개의 char 인자인 경우는 int 인자 수 만큼 char 인자 문자를 출력
 *  - 2개의 int 인자와 1개의 car 인자인 경우는 char 인자 문자를 n*m 형식의 행과 열로 출력
 *  
 *  	[예시]
 *  	- multiple(2, 3) 호출             [출력결과] 6
 * 		- multiple(4, 'ㅋ') 호출           [출력결과] ㅋㅋㅋㅋ
 *  	- multiple(2, 3, 'ㅋ') 호출        [출력결과] 2*3 ㅋㅋㅋㅋ
 *  												   ㅋㅋㅋㅋ
 * 
 *           
 */
 