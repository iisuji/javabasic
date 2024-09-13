package j_inherit;

//****** 상속 *******
public class Ddal extends Umma{ // 2개 이상으로부터 상속은 안 됨. ( extends Umma, Appa --> 안됨 )
	
	//생성자함수 
	public Ddal() { 
		System.out.println("딸 생성");
	}
	
	public void gene() {
		System.out.println("자식은 자식이다");
	}
	
	public void study() {
		System.out.println("딸은 학생");
	}
	
}
