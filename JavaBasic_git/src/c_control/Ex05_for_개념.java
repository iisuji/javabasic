package c_control;

public class Ex05_for_개념 {

	public static void main(String[] args) {

//		for(int a=0 ; a<3 ; a++) { 
//			System.out.println(a);
//	     }	
		//a메모리 확보 후 0을 넣음 -> a<3 true인 경우 -> 수행(출력) -> a++ -> a<3 -> 수행(출력) ... 반복 
		// ... a<3 false인 경우 -> 멈춤 

		
		// 1부터 10까지 나오게 하고 싶은 경우 
//		for(int a=1 ; a<=10 ; a++) {   
//			System.out.println(a);
//		}
		
		//누적의 합이 보고싶은 경우		
//		int result = 0;		
//		for(int a=1 ; a<=10 ; a++) {   
//			result = result + a;
//		}
//		System.out.println("결과:" + result);  // 결과 : 55 

			
			
			
		// 1부터 10까지의 홀수의 합과 짝수의 합을 구하기 -- 방법1
		
//		int odd=0, even=0;		
//		for(int i=1; i<=10; i++) {
//			//2로 나누었을 때 나머지가 1이면 홀수, 아니면 짝수 
//			if(i%2==1) {
//				odd += i; //홀수
//			}else {
//				even += i; //짝수 
//			}
//				}	
	
//		System.out.println("홀수의 합 : " +odd);		
//		System.out.println("짝수의 합 : " + even);

		
		
		// 1부터 10까지의 홀수의 합과 짝수의 합 구하기 -- 방법2
//		int odd=0, even=0;
//		
//		for(int i=1; i<=10; i+=2) {
//			odd+=i;
//			even+=(i+1);
//		}
//
//		System.out.println("홀수의 합 : " +odd);		
//		System.out.println("짝수의 합 : " + even);		

		
		
		
		// 2개씩 빼고 싶을 때 
//		for(int a=10 ; a>0 ; a=a-2) {
//			System.out.println(a);
//		}
		
				
		// A부터 Z까지 출력
//		for( char ch='A'; ch<='Z'; ch++) {
//			System.out.print(ch);
//		}
		
		
		// Z부터 A까지 출력
//		for( char ch='Z'; ch>='A'; ch--) {
//		System.out.print(ch);
//	}
		
		
		// '가'부터 '하'까지 출력
		for (char ch='가'; ch<='하'; ch++) {
			System.out.print(ch);
		}
		
		System.out.println(); //개행
		
		// 'ㄱ'부터 'ㅎ'까지 출력
		for (char ch='ㄱ'; ch<='ㅎ'; ch++) {
			System.out.print(ch);
		}
	
		
	}
	}
