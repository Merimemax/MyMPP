package assignment3;

public class USMail implements Service {
	private double weight;
	private String description;

	public USMail(double weight, String description) {
		this.weight = weight;
		this.description = description;
	}

	@Override
	public double getRate() {
		double rate = 1.00;
		if (weight > 3) {
			rate = 0.55;
		}
		return rate * weight;
	}

	public String getDescription() {
		return description;
	}

}
