package polymorphismTdp;

import java.time.LocalDate;

public class Salaried extends Employee {
	private double salary;

	public Salaried(String employeeId, double salary) {
		super(employeeId);
		this.salary = salary;
	}

	@Override
	public Paycheck calcGrossPay(LocalDate date, Employee e) {
		return new Paycheck(salary, e, date);
	}

	public double getSalary() {
		return salary;
	}

}
