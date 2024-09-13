package a_datatype;

public class Ex06_복습 {
	public static void main(String[] args) {
		
		// 나이를 저장할 변수 선언하고, 본인의 나이를 대입한 후 출력
		int age=37;
		System.out.println("나이:"+age);

		// 본인이 키를 소숫점 포함한 데이타로 저장하고 출력
		float height=166.5f;
		System.out.println("키:"+height);
	
		// 이름 저장할 변수를 선언하고 이름을 대입 후 출력
		char name = '홍';
		char name2 = '길';	
		char name3 = '동';
		
		//*****중요******
		// 문자 : char
		// 문자열 : string (클래스-참조형)
		String irum="홍길자";
		System.out.println("이름은 "+irum+"입니다");
		
		//전화번호, 주민번호, 학번 등은 "문자열"로 취급되어야 한다. 연산되면 안 되기 때문에. 
		
	}
}
