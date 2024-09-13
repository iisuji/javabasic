package n_collection;

public class Ex00_Objects {

	public static void main(String[] args) {
		
		StudentA a = new StudentA("01234", "홍길동");
		StudentA b = new StudentA("01234", "홍길동");

		System.out.println(a.toString());  // a만 넣고 실행하면, 주소값이 뜬다. 
		System.out.println(b.toString());
		
		if(a.equals(b)) {  // objcet 안에 equals 함수가 있음 
			System.out.println("동일인");
		}else {
			System.out.println("다른사람");
		}
		
	}

}


class StudentA {  //class StudentA extends Object
	
	String hakbun;
	String name; 
	
	// 생성자함수 (인자 있음) 
	public StudentA(String hakbun, String name){
		this.hakbun = hakbun;
		this.name = name; 
			
	}
	
	
	// equals(), toString() 메서드를 오버라이드 할 수 있는 건, Object 클래스가 자바의 모든 클래스의 최상위 부모 클래스이기 때문
	// 자바에서 모든 클래스는 Object 클래스를 상속받기 때문에, Object 클래스에 정의된 메서드를 모든 자바 클래스에서 사용할 수 있음 
	
	
	// equals() 메서드 오버라이드 ---> StudentA 객체의 ID와 이름이 같은지를 비교 
	// 아래 코드를 작성하면 다른사람 ---> 동일인으로 나옴 
	public boolean equals(Object obj) {
		StudentA other = (StudentA)obj;
		
		if(hakbun.equals(other.hakbun)) {
			return true;
		}else {
			return false;
		}	
	}
	
	// toString() 메서드 오버라이드 ---> StudentA 객체의 ID와 이름을 포함한 문자열을 반환
	public String toString() {  //Object 안에 toString 
		
		return "학번:" + hakbun + "[이름]:" + name;
		
	}
	
	
}
