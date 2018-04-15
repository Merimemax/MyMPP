package assignment3;

public class DHL implements Service {
	private static final double FIXED_RATE = 0.55;
	private double weight;
	private String description;

	public DHL(double weight, String description) {
		this.weight = weight;
		this.description = description;
	}

	@Override
	public double getRate() {
		return weight * FIXED_RATE;
	}

	public String getDescription() {
		return description;
	}

}
