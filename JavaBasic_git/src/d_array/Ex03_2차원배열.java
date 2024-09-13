package d_array;

// 2차원 배열이면 for문 2개
// 3차원 배열이면 for문 3개 

public class Ex03_2차원배열 {

	public static void main(String[] args) {
		
		// alpha라는 이름의 2D 문자 배열을 생성합니다. 이 배열은 3개의 행과 4개의 열을 가집니다. 
		char [][] alpha = new char[3][4];  
		
		
		//값 입력 --- 별표로 표현
		for(int i=0; i<alpha.length; i++) {		
			for(int j=0; j<4; j++) {
			alpha[i][j] = '*'; // i번째 행, j번째 열에 별표를 넣음 
			}
		}
		
		// 값 입력 (저장) 
		// 배열의 각 위치에 문자를 저장하는 과정 
//		char ch = 'A';
//		for(int i=0; i<alpha.length; i++) {		
//			for(int j=0; j<4; j++, ch++) {  // **   //보통은 값을 지정하지 않고 j<4 대신 alpha.length를 사용
//			alpha[i][j] = ch; // i번째에 별표를 넣어놓겠다
//			// ch++; ---> for문 안에 직접 넣어줘도 된다  **위치 
//			}
//		}
		
		
		// 위와 같지만 숫자에 한정을 두지 않은 코드 (length 활용) 
		// 배열의 각 위치에 문자를 저장하는 과정 
//		char ch = 'A';  // 문자 ch를 'A'로 초기화합니다. 이 문자는 배열에 저장될 문자를 나타냅니다.
//		for(int i=0 ; i<alpha.length ; i++) {   //외부 루프 : 행 순회
//			for(int j=0; j<alpha[i].length; j++, ch++) {  //내부 루프 : 열 순회 및 문자 증가
//				alpha[i][j] = ch;   // 현재 문자 ch를 배열의 위치(i,j)에 저장  			
//				}
//		}
		
		/*
		  <배열의 length 속성>
		  
		  char[][] alpha = new char[3][4]
		  
		  alpha.length는 배열의 첫 번째 차원의 길이, 즉 행의 수를 반환함.
		  이 경우 alpha는 3개의 행을 가지고 있으므로 alpha.length=3
		  
		  alpha[i].length는 배열의 i번째 행에 대한 열의 수를 반환함.
		  이 경우 모든 행은 4개의 열을 가지고 있으므로, alpha[i].length=4
		 */
		
		
		/*
		 * 외부루프 i가 0부터 2까지 순회하면서 배열의 각 행을 순회
		 * 내부루프는 j가 0부터 3까지 순회하면서 배열의 각 열을 순회. 
		 * 내부 루프가 실행될 떄마다 ch 문자를 배열의 현재 위치에 저장하고, 
		 * ch를 다음 문자로 증가시킨다 (ch++) 
		 */
		
			
		// 값 출력
		// 배열의 각 위치에서 읽어 콘솔에 출력하는 과정 
		for(int i=0; i<alpha.length; i++) {
			for(int j=0; j<alpha[i].length; j++) {
			System.out.print(alpha[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
