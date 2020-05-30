package isp.solution1;

public class Manager implements IHumanWorker {

	@Override
	public void startWork() {
		System.out.println("Manager has started working");
	}

	@Override
	public void endWork() {
		System.out.println("Manager has ended working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager has started eating");
	}

	@Override
	public void endEat() {
		System.out.println("Manager has ended eating");
	}

}
