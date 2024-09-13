package e_constructor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 기본생성자 부름 
		Student s1 = new Student(); 
		
		System.out.println(s1.getName()+"님의 총점: " + s1.calTotal());
		System.out.println(s1.getName()+"님의 평균: " + s1.calAvg());	
	
	
		Scanner input = new Scanner(System.in);
		System.out.println("학생이름 -> ");
		String name = input.next();
		System.out.println("국어점수 -> ");
		int kor = input.nextInt();
		System.out.println("영어점수 -> ");
		int eng = input.nextInt();
		System.out.println("수학점수 -> ");
		int math = input.nextInt();
	
		// setter로 값을 지정, 아니면 생성자로 초기화 하여 값을 지정
		Student s2 = new Student(name, kor, eng, math);  // 인자로 생성자함수에 보냄
	
		System.out.println(s2.getName()+"님의 총점: " + s2.calTotal());
		System.out.println(s2.getName()+"님의 평균: " + s2.calAvg());	

	}
	
}
