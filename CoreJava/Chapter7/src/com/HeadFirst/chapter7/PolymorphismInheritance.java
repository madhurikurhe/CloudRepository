package com.HeadFirst.chapter7;

public class PolymorphismInheritance {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		A a2 = new A();
		a2.m1();
		a2.m2();
		a2.m3();
	}
}

class A {
	int ivar = 7;

	void m1() {
		System.out.print("A's m1, ");
	}

	void m2() {
		System.out.print("A's m2, ");
	}

	void m3() {
		System.out.print("A's m3, ");
	}

}

class B extends A {
	@Override
	void m1() {
		System.out.print("B's m1 , ");
	}
}

class C extends B {
	@Override
	void m3() {
		System.out.print("C's m3 , " + (ivar + 6));
	}
}
