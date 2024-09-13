package l_abstract;

/*
 *  abstract(추상) : 미완성 
 *  
 *   - method 앞에 써줌 : 오버라이딩에 강제성을 부여, 자녀가 코드를 완성해야 함   
 *   - class도 미완성 처리 해야 함 : 객체생성못함(부모클래스 역할만 해주어야 함) 
 *     // 클래스에 abstract가 붙어 있으면 new 못 써주고, 자식 클래스에 써줘야 하는 구나! 라고 생각하기
 *
 */

public abstract class Item { 

	// 자식들이 접근 가능하도록 protected로 지정 
	protected String num;
	protected String title;
	
	public Item() {
		num = "0";
		title = "";
		System.out.println("부모 기본 생성자 함수");
	}
	
	public Item(String num, String title) {
		this.num = num;
		this.title = title;
		System.out.println("부모 인자 생성자 함수");
	}
	
	// 오버라이딩 하는 부모 메소드에 뒤에 괄호 빼고 내용도 제거하여 혹시나 자녀 클래스에서 메소드명 오타 실수했을 때 내용이 뜨지 않도록 한다. 
	// 이름 필요, 오버라이딩이 필요함 
	public abstract void output(); 
	//abstract : 미완성 함수야.. 
	
}
