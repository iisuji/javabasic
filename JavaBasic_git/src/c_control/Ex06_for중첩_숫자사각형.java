package c_control;

import java.util.*;

public class Ex06_for중첩_숫자사각형 {

	public static void main(String[] args) {
		
		/*   [문제] 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
		 * 
		 * 			입력
		 * 			3	4   (줄 row / 칸 col)
		 * 
		 * 			출력
		 * 			1 2 3 4
		 * 			2 4 6 8
		 * 			3 6 9 12
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력 -> ");
		int row = input.nextInt(); //줄 (행)
		int col = input.nextInt(); //칸 (열)
//		
//		for(int i=1 ; i<=row ; i++) {
//			for(int j=1 ; j<=col ; j++) {
//				System.out.print(i*j + " ");
//			}
//			System.out.println();
//		}

		
		/*3 4 입력시 
		 * 
		 *  1 2 3 4 
		 *  5 6 7 8
		 *  9 10 11 12
		 */
		
//		int su = 1;
//		
//		for(int i=0; i<row; i++) {
//			for(int j=0 ; j<col ; j++ ) {
//				System.out.print(su + " ");
//				su++;
//			}
//			System.out.println(); // 개행
//		}
		
	
		
// ---- 다른 방법 : 초기화값을 for문 안에 직접 넣는 방법
		
		for(int i=0, su=1; i<row; i++) { //초기화한 값을 for 문 안에 넣어도 된다. 
			for(int j=0 ; j<col ; j++, su++ ) {
				System.out.print(su + " ");
			}
			System.out.println(); // 개행
		}
		
		
		
			
	}

}
