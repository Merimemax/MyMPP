package level45;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	List<Person> person = new ArrayList<>();

	public Department(String name) {
		this.name = name;
	}

	public double getTotalSalary() {
		double totalSalary = 0;
		for (Person p : person) {
			if (p instanceof Faculty) {
				totalSalary += ((Faculty) p).getSalary();
			}
			if (p instanceof Staff) {
				totalSalary += ((Staff) p).getSalary();
			}
		}
		return totalSalary;
	}

	public void showAllMembers() {
		person.forEach(s -> {
			System.out.println(s.getClass().getSimpleName() + " " + s);
		});
	}

	public void unitsPerFaculty() {
		for (Person p : person) {
			if (p instanceof Faculty) {
				Faculty fp = (Faculty) p;
				System.out.println(fp.getName() + " " + fp.getTotalUnits());
			}
		}
	}

	@SuppressWarnings("static-access")
	public void showAllStudents(String name) {
		if (name == null)
			System.out.println("Invalid Name");
		List<Course> facultyCourse = new ArrayList<>();

		for (Person p : person) {
			if (p instanceof Faculty) {
				if (p.getName().equalsIgnoreCase(name)) {
					Faculty fp = (Faculty) p;
					facultyCourse.addAll(fp.getCourses());
					break;
				}
			}
		}
		for (Person p : person) {
			List<Course> studentCourse = new ArrayList<>();
			if (p instanceof Student) {
				Student sp = (Student) p;
				studentCourse.addAll(sp.getCourses());

				List<Course> retained = new ArrayList<>(facultyCourse);
				retained.retainAll(studentCourse);
				if (!retained.isEmpty()) {
					System.out.println(sp.getName() + " " + retained.toString());
				}
			}
		}
		for (Person p : person) {
			List<Course> studentCourse = new ArrayList<>();
			
			if (p instanceof Staffstudents) {
				
				System.out.println(" those are staff students !!");
				Staffstudents sp = (Staffstudents) p;
				studentCourse.addAll(sp.getCourses());

				List<Course> retained = new ArrayList<>(facultyCourse);
				retained.retainAll(studentCourse);
				if (!retained.isEmpty()) {
					System.out.println(sp.getName() + " " + retained.toString());
				}
			}
		}

	}

	public String getDepartmentName() {
		return name;
	}

	public void addPerson(Person pers) {
		person.add(pers);
	}

	public void showAllStaffStudent() {
		Staffstudents.showAllStaffStudents();
	}

}
