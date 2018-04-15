package level123;

public class Course {
	private String number;
	private String title;
	private int units;

	public Course(String number, String title, int units) {
		this.number = number;
		this.title = title;
		this.units = units;
	}

	public String getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public int getUnits() {
		return units;
	}

	@Override
	public String toString() {
		return title;
	}
	// @Override
	// public String toString() {
	// return "Course [number=" + number + ", title=" + title + ", units=" + units +
	// "]";
	// }

}
