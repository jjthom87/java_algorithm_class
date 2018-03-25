package com.udemy.DSAClass.counter;

public class Counter {
	private String name;
	private Integer value = 0;
	
	public Counter(String str) {
		this.name = str;
	}
	
	public void increment() {
		this.value++;
	}
	
	public int getCurrentValue() {
		return value;
	}
	
	public String toString() {
		return this.name + ": " + this.value;
	}
	
}
