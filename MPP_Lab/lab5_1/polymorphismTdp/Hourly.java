package polymorphismTdp;

import java.time.LocalDate;

public class Hourly extends Employee {
	private double hourlywage = 15;
	private double hoursPerWeek;

	public Hourly(String employeeId, double hourlywage, double hoursPerWeek) {
		super(employeeId);
		this.hourlywage = hourlywage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public Paycheck calcGrossPay(LocalDate dateRange, Employee e) {
		return new Paycheck(hourlywage * hoursPerWeek * 4, e, dateRange);
	}
}
