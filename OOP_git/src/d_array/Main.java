package d_array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student[] s = new Student[3];  // *** 배열의 new 객체 생성
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<s.length ; i++) {  // 0부터 2까지 세 번 반복
			
			// ***중요****
			s[i] = new Student(); // *** Student 클래스도 new 객체생성
			
			System.out.println("학생명 입력 -> ");
			s[i].setName(input.next()); //s배열의 i번째 학생의 이름
			
			System.out.println("국어점수 입력 -> ");
			s[i].setKor(input.nextInt());  //s배열의 i번째 학생의 국어점수에 입력받은 값을 지정할 예정
			
			System.out.println("영어점수 입력 -> ");
			s[i].setEng(input.nextInt());
			
			System.out.println("수학점수 입력 -> ");
			s[i].setMath(input.nextInt());
			
			System.out.println("총점 : " + s[i].calTotal());
			System.out.println("평균 : " + s[i].calAvg());
			
		}
		
	}

}
