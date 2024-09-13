package e_constructor;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("정보를 입력할 학생수를 입력 -> ");
		int count = input.nextInt(); // 개수가 확정됨
		Student s[] = new Student[count];
		
		for(int i=0; i<count;i++ ) {
			System.out.println("학생이름 -> ");
			String name = input.next();
			System.out.println("국어점수 -> ");
			int kor = input.nextInt();
			System.out.println("영어점수 -> ");
			int eng = input.nextInt();
			System.out.println("수학점수 -> ");
			int math = input.nextInt();
		
			// setter로 값을 지정, 아니면 생성자로 초기화 하여 값을 지정
			s[i] = new Student(name, kor, eng, math);  // 인자로 생성자함수에 보냄
		
			System.out.println(s[i].getName()+"님의 총점: " + s[i].calTotal());
			System.out.println(s[i].getName()+"님의 평균: " + s[i].calAvg());	
		}
		
		

	}
	
}
