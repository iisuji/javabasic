package d_array;

import java.util.*;
public class Ex03_로또 {

	public static void main(String[] args) {
		
		// 값지정 : 임의의 값
		// 임의의 수 6개 lotto에 저장 
		int [][]lotto = new int [5][6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i][i]=(int)(Math.random()*45);
			for(int j=0; j<1; j++) {  
				if(lotto[j]==lotto[i]) {  // 중복 숫자 
					i--;
				}
			}
			System.out.println(lotto[i]+"/");
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]+" ");
		}
		
		//출력 

		
		
		
	}

}




/*
 * <중복값 제거 정답>
 * 바깥 for 앞에 DASI:
 * 
 *    for(int k=0; k<j; k++){
 *    	if(lotto[i][j]==lotto[i][k]){
 * 		j--;
 * 		continue DASI;
 *    }
 *    
 *    }
 *   
 * 
 * 
 * */

