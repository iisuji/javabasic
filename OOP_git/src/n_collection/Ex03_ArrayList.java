package n_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		
		ArrayList <Student> result = method();
		
		for(Student s : result) {
			System.out.println(s);
		}
		System.out.println("[참고]----------------------");
		// 전체 요소를 순서대로 검색할 떄 : Enumeration -> Iterator  ... 알아만 둘 것
		Iterator i = result.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
	
	static ArrayList <Student> method() {
		
		ArrayList /*<Student>*/ list = new ArrayList /*<Student>*/ (); //제너릭스 떼도 됨 
		list.add(new Student("홍길자", 23));
		list.add(new Student("홍길숙", 33));
		list.add(new Student("홍길동", 43));
		
		return list;
	}

}


class Student{
	
	String name;
	int age;
	
	Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	//오버라이딩
	public String toString() {
		return name + "님 학생은" + age + "살입니다";
	}
	
	
	
}