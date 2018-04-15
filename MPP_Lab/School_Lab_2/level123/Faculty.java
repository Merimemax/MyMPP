package level123;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
	double salary;
	List<Course> courses = new ArrayList<>();

	public Faculty(String name, String phone, int age, int salary) {
		super(name, phone, age);
		this.salary = salary;
	}

	public int getTotalUnits() {
		int totalUnits = 0;
		for (Course c : courses) {
			totalUnits += c.getUnits();
		}
		return totalUnits;
	}

	public void addCourse(Course co) {
		courses.add(co);
	}

	public double getSalary() {
		return salary;
	}

	public List<Course> getCourses() {
		return courses;
	}

}
