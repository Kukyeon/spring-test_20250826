package com.kkuk.test;

public class Calculator {

	
	public void add(int a, int b) { // 더하기
		System.out.println("덧셈 : a + b " + (a+b));
	}
	
	public void sub(int a, int b) { // 뺴기
		System.out.println("빼기 : a - b " + (a-b));
	}
	
	public void mult(int a, int b) { // 곱하기
		System.out.println("곱하기 : a * b " + (a*b));
	} 
	
	public void divi(int a, int b) { // 나누기
		System.out.println("나누기 : a / b " + (a/b));
	}
	
}
