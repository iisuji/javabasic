package j_inherit2;

public class PolySample {

	public static void main(String[] args) {
		
		Item[] result = method();
		
		//처리(출력)
		for(int i=0 ; i<result.length; i++) {
			result[i].output(); //다형성  
		}
		
	}

	static Item[] method() {  // return 하여 void ---> Item[] 으로 변경 
		// 데이터
		Book b = new Book("001", "파이썬", "ICT", "누군가");
		Dvd d = new Dvd("002", "탈주", "한국인", "한국감독");
		Cd c = new Cd();
		
		// 여러개 한번에 묶을 때 --> 배열 사용 
		Item[] obj = new Item[3];  // Object 클래스
		obj[0] = b;
		obj[1] = d;
		obj[2] = c; 
		
		return obj;
	}
	
}
