package level45;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Staffstudents extends Staff {
	private static List<Student> std = new ArrayList<>();

	public Staffstudents(Staff staff, double gpa) {
		super();
		std.add(new Student(staff.getName(), staff.getPhone(), staff.getAge(), gpa));
	}

	public List<Student> getStd() {
		return std;
	}

	public void addCourse(Course csco) {
		Student.addCourse(csco);
	}

	public static void showAllStaffStudents() {
		std.forEach(System.out::println);
	}

	public Collection<? extends Course> getCourses() {
		return Student.getCourses();
	}

}
