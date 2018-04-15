package level45;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private double GPA;
	static List<Course> courses = new ArrayList<>();

	public Student(String name, String phone, int age, double gpa) {
		super(name, phone, age);
		this.GPA = gpa;
	}

	public int getTotalUnits() {
		int totalUnits = 0;

		return totalUnits;
	}

	public static void addCourse(Course co) {
		courses.add(co);
	}

	public double getGPA() {
		return GPA;
	}

	public static List<Course> getCourses() {
		return courses;
	}

}
