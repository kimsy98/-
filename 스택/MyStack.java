package 자료구조구현;

import java.util.ArrayList;

public class MyStack<E> {
	private ArrayList<E> list;
	private int top;
	
	public MyStack() {
		this.list = new ArrayList<>();
		this.top = -1;
		
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public E push(E value) {
		list.add(++top,value);
		return value;
	}
	
	public E pop() {
		E value = list.get(top);
		list.remove(top--);
		return value;
	}
	public E peek() {
		return list.get(top);
	}
	
	
	// public static void main(String[] args) {
	// 	MyStack<Integer> s = new MyStack<Integer>();
		
	// 	s.push(1);
	// 	s.push(2);
	// 	while(!s.isEmpty()) {
	// 		System.out.println(s.peek());
	// 		System.out.println(s.pop());
	// 		System.out.println(s.pop());
				
	// 	}
		
		
		
	// }

}
