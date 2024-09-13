package n_collection;

/*
 * 
 *		자료구조 기초
 *		
 *		Stack : LIFO (Last In First Out) 
 * 				나중에 들어온 데이터가 먼저 나가는 구조    
 * 				ex) A,B,C가 들어온 순서대로 쌓였을 때 나중에 들어온 C부터 나가는 구조 (ex - 뒤로가기)
 * 		Queue : FIFO ( First In First Out )
 * 				먼저 들어온 데이터가 먼저 나가는 구조
 * 
 */

import java.util.*;
public class Ex08_StackQueue {

	public static void main(String[] args) {
		
		Stack stack = new Stack();  // LIFO
		stack.push("A"); 
		stack.push("B");
		stack.push("C");
		System.out.println("스택에서 데이터 꺼내기");
		while(!stack.empty()) {  // ~ 무언가 있다면
			System.out.println(stack.pop());  // C부터 결과값이 먼저 나옴을 알 수 있다. 
		}
		
		System.out.println();  // 개행 
		
		Queue queue = new LinkedList();  // Queue는 인터페이스여서, Queue 아래 있는 클래스 중 LinkedList를 써준다. 
		queue.offer("가");
		queue.offer("나");
		queue.offer("다");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()); 
		}
		
		
	}

}
