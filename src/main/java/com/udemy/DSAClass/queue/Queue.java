package com.udemy.DSAClass.queue;

public class Queue {

	private int maxSize; // initializes the set number of slots
	private long[] queueArray; // slots to main the data
	private int front; // this will be the index position for the element in the front
	private int rear; //this is also going to be the index position for the element at at the back of the line
	private int nItems; // counter to maintain the number of items in our queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0; // index position of the first slot of the array
		rear = -1; // there is no item in the array yet to be considered as the last item
		nItems = 0; //we dont have elements in the array yet
	}
	
	public void insert(long j) {
		rear++;
		queueArray[rear] = j;
		nItems++;
	}
	
	public void remove() {
		
	}
	
	public void view() {
		System.out.println("[ ");
		for(int i = 0; i < queueArray.length; i++) {
			System.out.println(queueArray[i] + " ");
		}
		System.out.println("]");
	}
	
}
