package n_collection;

import java.util.*;

public class Ex07_HashMap {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		HashMap <String, String> map = new HashMap <String, String>(); // String 개수만큼 제너릭스 적어줘야 함 
		
		//    	   아이디, 비밀번호
		map.put("javassem", "1111");
		map.put("javababo", "9999");
		map.put("kimjava", "9999");
		map.put("javassem", "1234"); // 위에 비번 1111로 입력된 건 덮어버려서 로그인되지 않고, 1234로 해야 로그인 된다. 

		while(true) {
			System.out.println("아이디->");
			String id = input.nextLine();
			System.out.println("비밀번호->");
			String pw = input.nextLine();
			
			if(map.containsKey(id)) {  // 입력받은 것이 키 값에 있니? 있으면~ 
				if((map.get(id)).equals(pw)) {  // (map.get(id))이 String이므로, .equals를 써야 한다. 
					System.out.println("로그인 성공");
					break;
				}else{
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
			}else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
			// 아래 부분에 구현 부분이 있다면
		
		} // continue; 는 여기에 떨어져서 아래 부분에 구현 부분이 있어도, while문을 반복할 수 있다. 
	}

}
