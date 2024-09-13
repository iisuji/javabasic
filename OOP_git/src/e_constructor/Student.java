package e_constructor;

/*
 *  [참고] 변수, 배열의 초기화
 *  
 *  	int a;  // 변수선언
 *  	a=10;   //값 지정
 * 		
 * 		int b = 20; // 변수선언 + 값 지정 => 초기화
 * 
 * 		int [] array = new int[3];
 * 		array[0] = 100;
 * 		array[1] = 200;
 * 		array[2] = 300; 
 * 
 * 		int[] array2 = {100, 200, 300}; => 초기화 
 * 
 *  [참고] 클래스를 초기화하려면?? 생성자함수(Constructor) 
 *   
 *   	- 클래스가 인스턴스화 할 때 (객체화, 메모리에 할당받는 그 순간) 실행하는 함수
 *   	- 생성자 함수 이름은 반드시 클래스명과 동일해야 함 
 *  	- 리턴형이 없음(void도 없음) 
 *  	- 오버로딩(overloading)이 가능
 *  		-> 메소드명이 동일하고 매개변수(인자)의 타입과 갯수가 다른 여러 개의 함수
 *   
 *   	- default constructor : 생성자함수를 한 개도 지정하지 않으면 자동 생성
 *   	- 한 개라도 지정하면 안 만들어 줌 
 *   
 *  [참고] 자바 특성 (클래스명, 변수명, 함수명, 생성자 이름 모두 동일해도 상관은 없음) 
 *  	class Test{  				// 클래스명
 *  		String Test; 			// 변수명
 *  		public void Test(){ }   // 함수명 (일반함수는 반드시 리턴형이 있어야 함(void라도))
			public Test(){ }        // 생성자 
 *  	}		
 * 
 * 	[참고] this와 this() 함수 
 * 		this : 자기 객체를 지칭하는 레퍼런스 (클래스 입장에서..)
 * 			   멤버변수나 멤버메소드를 명확하게 지칭할 때 
 * 		this() : 다른 생성자함수를 호출할 때 
 * 				 [주의] 무.조.건 첫 라인에 기술해야 됨! 
 */

public class Student {
	
		// member fields : 멤버변수들 ( 서로 다른 자료형 가능 )
		private String name;
		private int kor, eng, math; 
		private int total;
		private double avg; 

		
		// ----------------------
		// 생성자함수 constructor (void 쓰면 안 됨, 클래스 이름과 동일해야 함)
		public Student() {
//			name = "박길동";  // 여기에선 this. 써도 되고 안 써도 됨  
//			kor = 50;
//			eng = 50;
//			math = 50;
			this("박길동",50,50,50); // 이렇게 줄일 수 있다, 무조건 첫 라인 기재 // 1. 아래 생성자함수로 이동 
			System.out.println("기본생성자 호출"); //3. 출력
		}
				//오버로딩이 되므로 인자가 없는 Student(), 아래의 Student 모두 가능 
		public Student(String name, int kor, int eng, int math) {
			this.name = name; // 멤버의 name에 내 지역변수 name을 넣으려 함
			this.kor = kor;
			this.eng = eng;
			this.math = math; 
			System.out.println("인자 있는 생성자 호출"); //2. 출력
		}
		
		
		// member methods : 멤버함수들 
		public int calTotal() {  // public을 주어 어디서든 호출이 가능하도록 만듦
			total = kor + eng + math;
			return total;
		}
		public double calAvg() {
			avg = (double)total / 3;
			return avg; 
		}
		
		// setter / getter 
		// 마우스 우클릭 - Source - Generate getters and setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}	
		
	}

