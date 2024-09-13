package n_collection;

import java.util.ArrayList;
import java.util.Collections;
// ArrayList에는 인덱스가 있다. 

public class Ex02_ArrayList {

	public static void main(String[] args) {
		// generics 내가 지정할 타입을 명확하게 지정( ex- <String> )하면 노란 경고 딱지가 없어짐
		ArrayList<String> list = new ArrayList<String>(4);  // ArrayList() 개수 지정 안 하면 10개 기본, 증식함 
		list.add("rabbit");
		list.add("cat");
		list.add("dog");
		list.add("fox");
		list.add("ant");

		System.out.println(list);
		
		list.set(3, "lion"); // 3번째에 lion 지정
		System.out.println(list); // 3번째 for 대신 lion이 들어감
		
		list.add("tiger"); // 맨 마지막에 부착
		System.out.println(list); 
		
		list.remove(3); // 3번째를 제거 
		System.out.println(list);
		
		Collections.sort(list); // 순차대로 정렬해줌 
		System.out.println(list);
		
		System.out.println();  // 개행
		
		//-------------------------------------------------------
		
		// 새로운 for문, 최근에 자주 쓰임. 오리지널 for문에서 형변환하고 get 하는 거 한 줄 더 쓰기 싫엉! 
		for(String temp:list) {  // (하나씩 뽑음 : 뽑을 리스트) 
			System.out.println(temp);
		}
		
		System.out.println(); // 개행
		
		// original for문
		for(int i=0; i<list.size(); i++) {
			String obj = (String)list.get(i);   //부모 자식간의 관계에서는 형변환이 된다. 
			System.out.println(obj);
		}
		
		//-----------------------------------------------------------
		
	}

}
