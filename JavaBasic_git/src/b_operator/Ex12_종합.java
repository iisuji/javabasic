package b_operator;

public class Ex12_종합 {

	public static void main(String[] args) {
		
		int z = 10 - 7 ^ 3 + 1 * 2 & 4;   // 섞여있을 때에는 우선순위에 따름, 산술연산자 먼저 계산 
//		                    __1(2)_
//		        _2(3)_   ___3(5)___           
//                       ___4(15)_____    5=0101  & 4=0100 ---> 0100 = 4
//              _____5( )______________   3=0011 ^ 4=0100 ---> 0111 = 7       
		        
		System.out.println("Z=" + z);

		int i = 5;
		System.out.println(i++); // 5
		System.out.println(i++); // 6
		
		//i++ 후위 증가 연산자는 현재 변수의 값을 먼저 사용한 후, 변수의 값을 1 증가시킨다. 
		//출력시점 : 첫번째 결과에서 System.out.println(i++);는 i의 현재값을 출력, i=5
		//출력 후 i의 값이 1 증가하여 6이 된다. 
		
		
		int a = -5;
		if( (a>0) & (++a /3 >0)) {   // 여기까지 다 수행하고 나서 결론을 낸다
			a++;
		}
		System.out.println("A=" + a);  
		
		// &&일 때는, short circuit logic으로 이미 false이므로 '&&' 앞 부분만 계산, a=-5
		// '&' 으로 변경 시, if 조건문까지만 수행하고 조건이 맞지 않아 a++ 부분은 계산되지 않으므로
		// 첫째 줄의 ++a까지만 계산이 된다. 그러므로 a=-4
	}

}    
