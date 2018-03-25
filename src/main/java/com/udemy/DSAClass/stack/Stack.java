package com.udemy.DSAClass.stack;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	private String string;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	
	public void push(char j) {
//		try {
//			if(top <= (maxSize - 1)) {
//				top++;
//				stackArray[top] = j;
//			}	
//		} catch (Exception e) {
//			System.out.println("Too many items pushed to stack");
//		}
		if(isFull()) {
			System.out.println("Stack is full");
		} else {
			top++;
			stackArray[top] = j;
		}
	}
	
	public char pop() {
//		int old_top = top;
//		if(old_top <= 0) {
//			top--;
//			System.out.println(old_top);
//			//System.out.println(top);
//			return stackArray[old_top];	
//		} else {
//			return -1;
//		}
		if(isEmpty()) {
			System.out.println("Stack is already empty");
			return '0';
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
	
	public long peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize-1 == top);
	}
	
}
