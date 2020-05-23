package ocp.violation;

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
		switch (festival) {
		case NORMAL:
			return 0.07f;
		case DIWALI:
			return 0.08f;
		case RAMZAN:
			return 0.09f;
		default:
			break;
		}
		return 0;
	}

	public double calculateSimpleInterest() {
		return principle * duration * calculateRate() / 100;
	}

}
