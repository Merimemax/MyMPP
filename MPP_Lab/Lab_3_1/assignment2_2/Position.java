package assignment2_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Position {

	private String title;
	private String description;
	private Employee emp;
	private Department dept;
	private Position superior;

	private static List<Position> position = new ArrayList<>();
	public List<Position> inferiors = new ArrayList<>();

	public Position(String title, String description, Department dept, Employee emp1,Position superior) {
		this.title = title;
		this.description = description;
		this.dept = dept;
		emp = emp1;
		position.add(this);
			this.superior = superior;
	}

	public String print() {

		if (emp != null) {
			return emp.print();
		}
		return "";
	}

	public void printDownLine() {
		Iterator<Position> it = inferiors.iterator();
		System.out.println(this);
		while (it.hasNext()) {
			Position pp = it.next();
			pp.printDownLine();
		}
	}

	public void addInferiors(Position infe) {
		inferiors.add(infe);
	}

	public Employee getEmployee() {
		return emp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSalary() {
		double sal = 0;
		if (emp != null) {
			sal = emp.getSalary();
		}
		return sal;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Position [" + emp.getName() + ", dept=" + dept.getName() + "]";
	}

	public Position getSuperior() {
		return superior;
	}

}
