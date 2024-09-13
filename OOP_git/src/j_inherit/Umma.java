package j_inherit;

public class Umma extends Object{ // 쓰지 않아도 되지만, 모든 클래스는 Object를 상속받는다. 
	
	//생성자함수 
	public Umma() { 
			System.out.println("엄마 생성");
	}
	
	public void gene() {
		System.out.println("부모는 부모다");
	}
	
	public void job() {
		System.out.println("엄마는 대장");
	}
	
}
