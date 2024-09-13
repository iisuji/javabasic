package e_method;

import java.util.Scanner;

public class Ex99_복습3 {

	public static void main(String[] args) {
		char[][] ch = input();  // 1. main에서 시작, input()으로 가기
								// 9. 저장한 return 값을 input()쪽에 저장해준다. char[][] ch = input(); 
		output(ch);	// 10. output()에 인자값 지정하고, output()으로 이동
	}
	
	/*
	문자 배열에 저장된 문자들을 화면에 출력한다.
	*/
	static void output(char [][] ch) { // 11. output(ch) 파라미터로 받기
		for(int i=0; i<ch.length ; i++) {  // 12. 이중 for문 사용하여 배열 출력하는 코드 적어주고 출력하면 끝!  
			for(int j=0; j<ch[i].length; j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println(); 
		}
		
	}

	/*
	두 정수와 알파벳 문자 하나를 입력받는다
	[예] 3 4 F
	*/	
	static char[][] input() { // 2. 받은 인자가 없으므로 input() 공백 
		
		Scanner input = new Scanner(System.in); // 두 정수와 알파벳 문자 입력 받을 스캐너 입력창 불러오기 + import

		System.out.println("첫 번째 숫자 입력 ->"); 
		int a = input.nextInt();	// 첫 번째 숫자 입력값을 정수형 변수 a에 담기
		
		System.out.println("두 번째 숫자 입력 ->");
		int b = input.nextInt();	// 두 번째 숫자 입력값을 정수형 변수 b에 담기
		
		System.out.println("알파벳 입력 -> ");
		char alpha = input.next().charAt(0);	// 알파벳 문자 하나를 문자 변수 alpha에 담기 
												// (char형은 input.next().charAt(0)으로 불러올 수 있다) 
		
		char [][] ch = makeSquare(a, b, alpha);  // 3. makeSquare 함수를 찾아 인자를 보낸다.  
												 // 7. makeSquare 앞쪽에 return값을 저장해준다. char[][] ch = ... 
		return ch;  // 8. 저장한 ch를 다시 리턴하여 기존 input()이 속해있는 main으로 이동  
					// return시에 위쪽의 void input() ---> char[][] input()으로 변경
	}	
	
	// 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	//		입력받은 문자를 시작으로 저장한다. 
	/*
	 * 		F	G	H	I
	 * 		J	K	L	M
	 * 		N	O	P	Q
	 */
	static char[][] makeSquare(int a, int b, char alpha) { // 4. 파라미터로 인자를 받는다. 받은 인자를 자료형과 함께 변수 적기.  
		 char [][]  ch = new char [a][b];   // 5. 배열과 이중for문을 사용해 입력받은 문자를 시작으로 저장한다. 
		 
		 for(int i=0; i<a; i++) {
			 for(int j=0; j<b; j++) {
				 ch[i][j]=alpha;  // 현재 문자 alpha를 배열의 위치 ch(i,j)에 저장  
				 alpha++;
			 }
		 }
		 
		 return ch; // 6. 저장한 ch 배열을 저장하여 리턴 ---> makeSquare로 가서 저장
		 			// return시에 void makeSquare ---> char[][] makeSquare로 변경해줄 것!! 
		 
		 
	}

}
