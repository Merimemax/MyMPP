package polymorphismTdp;

import java.time.LocalDate;

public final class Paycheck {
	private final double grossPay;
	private final double fica = 0.23;
	private final double state = 0.05;
	private final double local = 0.01;
	private final double medicare = 0.03;
	private final double socialSecurity = 0.075;
	
	private DateRange payPeriod;
	private Employee emp;

	
	public Paycheck(double grossPay, Employee emp, LocalDate payDay) {
		this.grossPay = grossPay;
		this.emp = emp;
		payPeriod = new DateRange(payDay, LocalDate.of(payDay.getDayOfYear(), payDay.getDayOfMonth(), payDay.getDayOfMonth()));
	}
	public void print() {

	}

	public double getNetPay() {
		double totalTax = grossPay * fica * state * local * medicare * socialSecurity;
		return grossPay - totalTax;
	}
	
}
