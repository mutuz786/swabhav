package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {

		Circle[] circles = new Circle[5];
		circles[0]=new Circle();
		circles[0].setRadius(5f);
		circles[1]=new Circle();
		circles[1].setRadius(10f);
		circles[2]=new Circle();
		circles[2].setRadius(2.5f);
		circles[3]=new Circle();
		circles[3].setRadius(3f);
		circles[4]=new Circle();
		circles[4].setRadius(6f);

		printInfo(circles);
		System.out.println("Largest circle is radius " + findBigCircle(circles).getRadius());
		System.out.println("Smallest circle is radius " + findSmallCircle(circles).getRadius());
		System.out.println("The biggest circle has perimeter " + findBigPerimeter(circles).calculatePerimeter());
		System.out.println("The small circle has perimeter " + findSmallPerimeter(circles).calculatePerimeter());
		printInfo(findBigCircle(circles));
		printInfo(findSmallCircle(circles));
		printInfo(findBigPerimeter(circles));
		printInfo(findSmallPerimeter(circles));
	}

	private static Circle findBigPerimeter(Circle[] circles) {
		Circle temp = circles[0];
		for (Circle circle : circles) {
			if (circle.calculatePerimeter() > temp.calculatePerimeter())
				temp = circle;
		}
		return temp;
	}
	
	private static Circle findSmallPerimeter(Circle[] circles) {
		Circle temp = circles[0];
		for (Circle circle : circles) {
			if (circle.calculatePerimeter() < temp.calculatePerimeter())
				temp = circle;
		}
		return temp;
	}

	private static Circle findBigCircle(Circle[] circles) {
		Circle temp = circles[0];
		for (Circle circle : circles) {
			if (circle.getRadius() > temp.getRadius())
				temp = circle;
		}
		return temp;
	}

	private static Circle findSmallCircle(Circle[] circles) {
		Circle temp = circles[0];
		for (Circle circle : circles) {
			if (circle.getRadius() < temp.getRadius())
				temp = circle;
		}
		return temp;
	}

	private static void printInfo(Circle[] circles) {
		for (Circle circle : circles) {
			printInfo(circle);
		}
	}

	private static void printInfo(Circle circle) {
		System.out.printf("Radius:%f \t Area:%f \t Perimeter:%f \n", circle.getRadius(), circle.calculateArea(),
				circle.calculatePerimeter());
	}
}
