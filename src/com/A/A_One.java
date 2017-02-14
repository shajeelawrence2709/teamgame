package com.A;

public class A_One {
	
	public A_One(){
		System.out.println("constructor");
	}
	public void a_one(){
		System.out.println("a_one");
		System.out.println("This is modified");
	}

	public void display() {
		System.out.println("Print Display");
		System.out.println("Print Display Again");

	}

	public static void main(String[] args) {
		System.out.println("gfh");
		A_One obj=new A_One();
		obj.display();
	}

}
