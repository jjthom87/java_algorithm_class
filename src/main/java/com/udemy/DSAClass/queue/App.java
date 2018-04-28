package com.udemy.DSAClass.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(90);
		myQueue.insert(80);
		myQueue.insert(70);
		myQueue.insert(60);
		myQueue.view();
		myQueue.remove();
		myQueue.view();
	}

}
