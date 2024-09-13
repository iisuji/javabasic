package h_innerclass;

/*
 *  inner class : 클래스 안에 클래스 (멤버 취급) 
 *  
 *  inner class는 멤버 취급을 하다보니 static을 붙일 수 있다. 
 *  
 */

class Outer{
	
	static class Inner{
		static void najabara() {
			System.out.println("잡아봅시다");
		}
	}
}


public class MainTest {

	public static void main(String[] args) {
	 /* Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.najabara(); */
	 /* Outer.Inner in = new Outer.Inner();
		in.najabara();  */
		Outer.Inner.najabara();
		
	}

}
