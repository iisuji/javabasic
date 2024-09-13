package b_operator;

/*
 * 대입연산자 = 
 * 
 * 		대입연산자 축약 : 산술, 쉬프트, 이진논리  (쉬프트, 이진논리는 잘 사용안함)  
 * 
 * 		a = a+b;  ==>  a+=b; 
 * 		a = a-b;  ==>  a-=b;
 * 		a = a*b;  ==>  a*=b;
 * 		a = a/b;  ==>  a/=b;
 * 		a = a%b;  ==>  a%=b; 		
 *   
 */



public class Ex11_대입연산자 {

	public static void main(String[] args) {
		
		int a=10, b=7;
		
		a+=b;  // a=a+b
		System.out.println("+=결과 : " + a);

		a-=b;  // a=a-b
		System.out.println("-=결과 : " + a);
		
		a*=b;  // a=a*b
		System.out.println("*=결과 : " + a);
		
		a/=b;  // a=a/b
		System.out.println("/=결과 : " + a);
		
		a%=b;  // a=a/b 나머지 
		System.out.println("%=결과 : " + a);
		
		
	}

}
