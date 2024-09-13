package c_control;

public class Ex04_switch_복습 {

	/*
	  	평균을 구해서 90 이상이면 'A' 학점
	 	90 미만 80 이상이면 'B' 학점
	 	80 미만 70 이상이면 'C' 학점
	 	그외는 'F'
	 	(switch문 이용) 
	 */
	
	
	public static void main(String[] args) {
		
		int kor=90, eng=80, math=70;
		int total = kor + eng + math;
		int avg = total / 3; 
		System.out.println("평균 : " + avg);
		
		 // char score = '';   // (에러) char 는 빈문자가 존재하지 않음
		 // char score ='0';   // 이렇게 쓰는 경우가 더 많지만 자바스럽진 않음 ㅋ
		char score = '\u0000';  // unicode 0을 초기화 해줄 때 
		
		switch(avg/10) {
			// [avg/10]으로 적어줘야 하는 이유
				// case에는 >=, < 등의 부등식을 적어줄 수 없어서 >=90 (X)
				// 그냥 평균값 avg만 적으면, 아래 조건값에 모든 점수를 넣어줘야 하므로
				// switch를 사용하는 의미가 없음
		
		case 10 :    //break가 없는 경우 아래로 내려온 후 break가 되므로 결과값은 'A'
		case 9 : score= 'A'; break;  
		case 8 : score= 'B'; break;
		case 7 : score= 'C' ; break;
		default : score= 'F'; 
		
		}
		System.out.println("학점 : "+ score);

	}

}
