package ocp.solution1;

public enum FestivalType {
	NORMAL, DIWALI, RAMZAN;

	public float getRates() {
		switch (this) {
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
}
