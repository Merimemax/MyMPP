package assignment3;

public class UPS implements Service {
	private double weight;
	private static final double FIXED_RATE = 0.45;
	private String description;

	public UPS(double weight, String description) {
		this.weight = weight;
		this.description = description;
	}

	@Override
	public double getRate() {
		return FIXED_RATE * weight;
	}

	public String getDescription() {
		return description;
	}

}
