package com.corejava.polymorphism;

public class MethodOverLoading {
	//method1
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c+"   2 argument method is called");
		}
		
	
//method2	
		public void add(int a,int b,int c) {
			System.out.println(a+b+c+"  3 argument method is called");
		
	}
		public static void main(String[] args) {
			MethodOverLoading ml=new MethodOverLoading();
			ml.add(2, 4,4);
		}

}
