package n_collection;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		List result=method();  // return 반환값 List result로 받음 
		
		//처리
		for(int i=0; i<result.size(); i++) {
			Object obj = result.get(i);
			System.out.println(obj);
		}
	}
	
	
	static List method() {   //return 반환값으로 void --> List로 바꾸기 
		//데이터
		String name = "홍길자";
		Integer age = 100; // int라고 써도 됨 (호환됐을 경우, 호환 안 될 때는 int로 써야 함) 
		Double height = 190.99;
		
		List list = new ArrayList();  // 변수 부모, 객체 자식 
		//Object[] obj = new Object[개수]; //메모리 줄이려면 사용?
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
		
	}
	
}
