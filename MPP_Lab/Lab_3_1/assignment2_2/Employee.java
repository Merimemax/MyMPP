package assignment2_2;

public class Employee {
	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String ssn;
	private double salary;

	private Position pos;

	public Employee(int employeeId, String firstName, String middleInitial, String lastName, String ssn,
			double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.ssn = ssn;
		this.salary = salary;

	}

	public String print() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleInitial=" + middleInitial
				+ ", lastName=" + lastName + ", ssn=" + ssn + ", salary= " + String.format("$%.2f", salary) + "]";
	}

	public double getSalary() {
		return salary;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public String getName() {
		return  firstName;
	}
	

}
