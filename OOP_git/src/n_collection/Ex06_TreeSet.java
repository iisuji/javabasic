package n_collection;

import java.util.*;

public class Ex06_TreeSet {

	public static void main(String[] args) {

		TreeSet <String> set = new TreeSet <String> ();
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("zebra");
		set.add("dog"); // 중복은 안 나옴 
		System.out.println(set);
		System.out.println(set.subSet("d", "s")); // d~s까지 가져오세요
		System.out.println(set.headSet("e")); // 앞부터 e까지
		System.out.println(set.tailSet("e")); // e에서 마지막 
		
	}
}
