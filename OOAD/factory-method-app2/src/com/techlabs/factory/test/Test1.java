package com.techlabs.factory.test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factory.IAuto;
import com.techlabs.factory.IAutomobileFactory;

public class Test1 {
	public static void main(String[] args) {
		IAutomobileFactory factory = injectDependency();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
	}

	private static IAutomobileFactory injectDependency() {
		try {
			Properties property = new Properties();
			property.load(new FileInputStream(new File("dependency/factory.properties")));
			Class<?> class1 = (Class<?>) Class
					.forName(property.getProperty("factory"));
			Method method = class1.getDeclaredMethod("getInstance", null);
			return (IAutomobileFactory) method.invoke(null, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
