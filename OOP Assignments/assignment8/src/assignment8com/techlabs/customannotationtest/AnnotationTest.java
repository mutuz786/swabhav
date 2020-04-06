package assignment8com.techlabs.customannotationtest;

import java.lang.reflect.*;

public class AnnotationTest {
	public static void main(String[] args) {
		int trueCases = getCaseCount(true);
		int falseCases = getCaseCount(false);
		System.out.println("Number of Testcases Present:"+(trueCases+falseCases));
		System.out.println("Passing Testcases:"+trueCases);
		System.out.println("Failing Testcases:"+falseCases);
	}

	private static int getCaseCount(boolean testCase) {
		int count=0;
		Class<Foo> fooClass = Foo.class;
		Method[] methods = fooClass.getDeclaredMethods();
		for (Method method : methods) {
			UnitTestCase annotation = method.getAnnotation(UnitTestCase.class);
			if (annotation != null) {
				count+=isTestCase(method,testCase);
			}
		}
		return count;
	}

	private static int isTestCase(Method method, boolean testCase) {
		Foo foo=new Foo();
		boolean result = false;
		try {
			result = (boolean) method.invoke(foo);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		if(result==testCase) {
			return 1;
		}
		return 0;
	}
}
