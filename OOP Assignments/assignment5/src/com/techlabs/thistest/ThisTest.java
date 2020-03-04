package com.techlabs.thistest;

public class ThisTest {
	public static void main(String[] args) {
		InstanceReference case1 = new InstanceReference(10, 5);
		System.out.println("Case1 Area:" + case1.calculateArea());

		ConstructorInvoke case2 = new ConstructorInvoke();
		System.out.println("Case2 Area:" + case2.calculateArea());

		ClassInstance case3 = new ClassInstance(20, 10);
		System.out.println("Case3 Area(1.1):" + case3.calculateArea());
		System.out.println("Case3 Area(1.2):" + case3.getDefault().calculateArea());

		MethodArgument case4 = new MethodArgument();
		System.out.println("Case4 Area:" + case4.display());

		MethodInvoke case5 = new MethodInvoke();
		System.out.println("Case5 Area(1.1):" + case5.calculateArea());
		System.out.println("Case5 Area(1.2):" + case5.calculateArea());

	}
}
