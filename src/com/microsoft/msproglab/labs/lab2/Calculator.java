package com.microsoft.msproglab.labs.lab2;

public class Calculator {
	
	
	public static long ADD(long a, long b) {
		return a + b;
	}
	
	public static long SUBTRACT(long a, long b) {
		return a - b;
	}
	
	public static long DIV(long a, long b) {
		return a % b;
	}
	
	public static long MULTIPLY(long a, long b) {
		return a * b;
	}
	
	public static void main(String[]args) {
		System.out.println("ADD: "+ADD(2, 1));
		System.out.println("SUBTRACT: "+SUBTRACT(2, 1));
		System.out.println("DIV: "+DIV(4, 2));
		System.out.println("MULTIPLY: "+MULTIPLY(2, 3));
	}
}
