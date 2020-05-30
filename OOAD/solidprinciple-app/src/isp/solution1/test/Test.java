package isp.solution1.test;

import isp.solution1.*;

public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		atCafeteria(manager);
		// atCafeteria(robot);
		atWorkStation(manager);
		atWorkStation(robot);
	}

	private static void atWorkStation(IWorker worker) {

		System.out.println("At workstation");
		worker.startWork();
		worker.endWork();
	}

	private static void atCafeteria(IHumanWorker worker) {
		System.out.println("At cafeteria");
		worker.startEat();
		worker.endEat();
	}
}
