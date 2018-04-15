package assignment3;

public class FedEx implements Service {
	private double weight;
	private Zone zone;
	private String description;

	public FedEx(double weight, Zone zone, String description) {
		this.weight = weight;
		this.zone = zone;
		this.description = description;
	}

	@Override
	public double getRate() {
		return zone.getValue() * weight;
	}

	public String getDescription() {
		return description;
	}

}
