package com.techlabs.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface NeedRefactoring {

}

public class AnnotationClass {
	private static int count = 0;

	public static void main(String args[]) {
		annotationCount();
		System.out.println("No of annotated methods:" + count);

	}

	private static int annotationCount() {

		Class c = RequiredRefactoring.class;
		System.out.println("Following methods Need refactoring");
		caseStudy1(c);
		return count;
	}

	private static int caseStudy1(Class c) {
		for (Method m1 : c.getMethods()) {
			caseStudy2(m1);
		}
		return count;
	}

	private static int caseStudy2(Method m1) {
		if (m1.getAnnotations() != null) {
			Annotation[] annos = m1.getAnnotations();
			caseStudy3(m1, annos);
		}
		return count;
		
	}

	private static int caseStudy3(Method m1, Annotation[] annos) {
		for (Annotation a : annos) {
			caseStudy4(m1, a);
		}
		return count;
	}

	private static void caseStudy4(Method m1, Annotation a) {
		if (a instanceof NeedRefactoring) {
			System.out.println(m1.getName());
			count++;
		}
	}
}
