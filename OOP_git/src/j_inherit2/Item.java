package j_inherit2;

public class Item {

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
	
	public void output() {
		
	}
	
}
