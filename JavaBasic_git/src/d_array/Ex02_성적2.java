package d_array;

/*
 * 5명의 국어점수를 입력하세요 (입력예시 : 10/10/10/10/10) -> 55/66/75/69/72
 * 총점은 xxxx이고, 평균은 oooo입니다. 
 */
import java.util.*;
public class Ex02_성적2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력하세요 ->");
		String score_str = input.nextLine();  // 문자열로 입력한 내용을 받는다. 
		
		StringTokenizer st = new StringTokenizer(score_str, "/"); 
		
		int score[] =new int[st.countTokens()]; //진짜 정수를 저장해줄 공간
		System.out.println(score.length); //score의 길이를 먼저 확인 
		
		for(int i=0; i<score.length; i++) {
			score[i] = Integer.parseInt(st.nextToken());  
		}
		
		
		// 총점 구하기
		int total = 0;
		
		for(int i=0; i<score.length; i++) {
			total += score[i];  
		}
		
				
		// 총점과 평균 출력 
		System.out.println("총점:" + total);
		System.out.println("평균:" + total/score.length);

	}

}
