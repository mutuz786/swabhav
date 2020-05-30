package isp.violation.test;

import isp.violation.*;

public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		atCafeteria(manager);
		atCafeteria(robot);
		atWorkStation(manager);
		atWorkStation(robot);
	}

	private static void atWorkStation(IWorker worker) {
		
		System.out.println("At workstation");
		worker.startWork();
		worker.endWork();
	}

	private static void atCafeteria(IWorker worker) {
		System.out.println("At cafeteria");
		worker.startEat();
		worker.endEat();
	}
}
