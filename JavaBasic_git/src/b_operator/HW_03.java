package b_operator;

import java.util.Scanner;

public class HW_03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println(a+" "+b+" "+c); // 세 정수 A, B, C가 공백으로 구분되어 주어진다. 
		
		int second;
		if(a<=b && a>=c || a>=b && a<=c) {  //    c<=a<=b,   b<=a<=c
			second=a;
		} else if(b<=a && b>=c || b>=a && b<=c) {  //    c<=b<=a,   c<=b<=a
			second=b;
		}else {
			second=c;
		}
		System.out.println("두 번째 수:" + second); // 두 번째로 큰 정수를 출력한다. 
		
	}
}
