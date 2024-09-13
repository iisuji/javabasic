package b_encapsulation;

public class MainTest {

	public static void main(String[] args) {
		//클래스 변수 선언
//		Student s = null;
		
		//객체 생성 
//		s = new Student();
		
		// (일반적) 클래스 변수 선언 + 객체 생성
		// 이렇게 하면 heap 메모리에 Student 클래스에 있는 내용들이 잡힌다. 
		Student s = new Student();
		
		// 값 지정 및 처리
//		s.name = "홍길순";
//		s.kor = 88;
//		s.eng = 77;
//		s.math = 60;
		
		// 멤버 변수들이 private 변수들이어서 아래와 같이 접속할 수 있다. 
		s.setName("홍길순");
		s.setKor(88);
		s.setEng(77);
		s.setMath(60);
		
		
		System.out.println(s.getName()+"님 총점 : " + s.calTotal());

//		s.total = 300;
		System.out.println(s.getName() + "님 평균 : " + s.calAvg());
		
	}

}
