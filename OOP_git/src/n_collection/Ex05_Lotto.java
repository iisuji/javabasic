package n_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex05_Lotto {

		public static void main(String[] args) {
			Set <Integer> lotto = new HashSet <Integer> (); // 중복되는 수 제외 
			
			while(lotto.size()<6) {   //일반 for문으로 쓰면 i++을 사용하지 않으므로 while로 바꿔주면 좋음
									  // for문일 때, i<6 이렇게만 쓰면 중복된 수 제거해서 개수가 6개로 고정되어 있지 않음 
			//	int num = (int)(Math.random()*45)+1; 
			//	lotto.add(num);  //위의 결과를 num에 저장 
				
				lotto.add((int)(Math.random()*45)+1);  // 이것만 한 줄로 쓸 수도 있다. 
			}
			
		    List list = new ArrayList(lotto);
		    Collections.sort(list);
			System.out.println(list);
			
		}
}
