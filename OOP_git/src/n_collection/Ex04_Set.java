package n_collection;

import java.util.*;

public class Ex04_Set {

		public static void main(String[] args) {
			
			Set set = new HashSet();  
			
			set.add("zebra");
			set.add("cat");
			set.add("dog");
			set.add("ant");
			set.add("dog");
			set.add("dog");
			
			System.out.println(set);  // 중복값이 안 들어감, 인덱스가 없기 때문 
			
		}
	
}
