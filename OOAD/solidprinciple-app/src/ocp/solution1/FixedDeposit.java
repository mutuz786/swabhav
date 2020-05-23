package ocp.solution1;

public class FixedDeposit {
	private int id;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(int id, String name, double principle, int duration, FestivalType festival) {
		this.id = id;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}

	public float calculateRate() {
		return festival.getRates();
	}

	public double calculateTotalInterest() {
		return principle * duration * calculateRate() / 100;
	}

}
