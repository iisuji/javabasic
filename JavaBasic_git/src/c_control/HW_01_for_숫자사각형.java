package c_control;

import java.util.*;

public class HW_01_for_숫자사각형 {

	public static void main(String[] args) {
		
		
		// [문제1] 
//		Scanner input = new Scanner(System.in);
//		System.out.print("숫자 2개 입력 ->");
//		
//		int row = input.nextInt(); // 줄 (행) 
//		int col = input.nextInt(); // 칸 (열)
//		
//		int su=1;
//		
//		for(int i=0; i<row; i++ ) {
//			for(int j=0; j<col; j++) {
//				System.out.print(su+" ");
//				su++;
//			}
//			System.out.println(); //개행 
//		}
		
	
		// [문제2]
		
		//이건 배열로 푼 정답, 아직 배열 배우지 않았음 
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 1개 입력 ->");
		
		int n = input.nextInt(); // 정사각형이므로 row, col 같음
		
		int[][] numArr = new int [n][n];
		
		int num = 1;
		
		for(int i=0; i<n; i++ ) {
			for(int j=0; j<n; j++) {
				numArr[j][i] = num++;
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(numArr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
