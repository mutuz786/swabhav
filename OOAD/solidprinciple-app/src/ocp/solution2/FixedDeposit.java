package ocp.solution2;

public class FixedDeposit {
	private int id;
	private String name;
	private double principle;
	private int duration;
	private IFestivalType festival;

	public FixedDeposit(int id, String name, double principle, int duration, IFestivalType festival) {
		this.id = id;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}

	public double calculateSimpleInterest() {
		return principle * duration * festival.getRate() / 100;
	}

	public float calculateRate() {
		return festival.getRate();
	}

}
