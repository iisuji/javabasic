package j_inherit2;

import java.util.Scanner;

public class Poly { // 다형성

	public static void main(String[] args) {
		
		Item i = null;  // 부모클래스의 변수만 지정 
		
//		Book b = null;
//		Dvd  d = null;
//		Cd   c = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 상품 선택 (1.책  2.DVD 3.CD ) -> ");
		int sel = input.nextInt();
		
		
//		switch(sel) {
//		case 1: b = new Book("001","자바책","ICT","자바쌤"); break;
//		case 2: d = new Dvd("002","아바타2","AI","카메론");  break;
//		case 3: c = new Cd(); break;	
//		}
		
		switch(sel) {  // 부모 클래스로 불러옴 
		case 1: i = new Book("001","자바책","ICT","자바쌤"); break;
		case 2: i = new Dvd("002","아바타2","AI","카메론");  break;
		case 3: i = new Cd(); break;
		
		}
		
		
//		switch(sel) {
//		case 1: b.output(); break;
//		case 2: d.output(); break;
//		case 3: c.output(); break;
//		}
		
		i.output(); //****** 부모 자녀 여러 줄 쓰지 않고 한 줄로 쓸 수 있다 **********
		
	}

}