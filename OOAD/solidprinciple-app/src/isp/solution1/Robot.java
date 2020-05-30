package isp.solution1;

public class Robot implements IMachineWorker {

	@Override
	public void startWork() {
		System.out.println("Robot has started working");
	}

	@Override
	public void endWork() {
		System.out.println("Robot has ended working");
	}
}
