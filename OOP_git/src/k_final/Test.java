package k_final;

/*
 * 	    앞에 final이 붙으면 : 값 변경불가
 * 			- class : 앞에 final 붙이면 부모클래스 못 됨
 * 			- field : 값 변경 
 * 			- method : 앞에 final붙이면 오버라이딩을 막겠다는 것
 * 
 */

class Parent{ 
	final String field = "부모님꺼";  //final이 붙으면 값 변경이 안 된다. 
	final void jib() { // 앞에 final 붙으면 오버라이딩을 막겠다는 것 
		System.out.println("부모님이 만드신 집");
	}
}

class Child extends Parent{
	Child(){
		// field = "내꺼";
	}
//	void jib() {
//		System.out.println("자식이 탕진");
//	}
}


public class Test {

	public static void main(String[] args) {

		Parent p = new Child();  // 부모와 자식 모두의 메모리에서 부모 메모리의 p값만 볼거야~
		System.out.println(p.field);
		p.jib();

	}

}
