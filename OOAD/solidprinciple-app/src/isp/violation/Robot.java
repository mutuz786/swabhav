package isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot has started working");
	}

	@Override
	public void endWork() {
		System.out.println("Robot has ended working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot cant eat");
	}

	@Override
	public void endEat() {
		throw new RuntimeException("Robot cant eat");
	}

}
