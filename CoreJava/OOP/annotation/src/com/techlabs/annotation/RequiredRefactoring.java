package com.techlabs.annotation;

import com.techlabs.annotation.NeedRefactoring;

public class RequiredRefactoring {

	@NeedRefactoring
	public void myMethod1() {
		System.out.println("myMethod requires refactoring");
	}

	@NeedRefactoring
	public void myMethod2() {
		System.out.println("myMethod1 requires refactoring");
	}

	@NeedRefactoring
	public void myMethod3() {
		System.out.println("myMethod1 requires refactoring");
	}

	public void myMethod4() {
		System.out.println("myMethod1 requires refactoring");
	}

	public void myMethod5() {
		System.out.println("myMethod2 requires refactoring");
	}

	public void myMethod6() {
		System.out.println("myMethod1 requires refactoring");
	}

}
