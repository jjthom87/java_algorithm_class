package com.udemy.DSAClass.stack;

public class App {
	public static void main(String[] args) {
		System.out.println(reverseString("jared"));
//		Stack theStack = new Stack(5);
//		theStack.push('j');
//		theStack.push('a');
//		theStack.push('r');
//		theStack.push('e');
//		theStack.push('d');
		
//		while(!theStack.isEmpty()) {
//			char value = theStack.pop();
//			System.out.println(value);
//		}
		
	}
	
	public static String reverseString(String str) {
		int num = 0;
		Stack theStack = new Stack(str.length());
		while(num < str.length()) {
			theStack.push(str.charAt(num));
			num++;
		}
		String reverseString = "";
		while(!theStack.isEmpty()) {
			reverseString += theStack.pop();
		}
		return reverseString;
	}
}
