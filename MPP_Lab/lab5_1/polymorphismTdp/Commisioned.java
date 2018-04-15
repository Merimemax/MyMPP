package polymorphismTdp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Commisioned extends Employee {
	private double commisionPersentage = 0.07;
	private double baseSalary;
	private List<Order> order = new ArrayList<>();

	public Commisioned(String employeeId, double baseSalary, List<Order> order2) {
		super(employeeId);
		this.baseSalary = baseSalary;
		order.addAll(order2);
	}

	@Override
	public Paycheck calcGrossPay(LocalDate date, Employee e) {
		return new Paycheck(commisionCal() + baseSalary, e, date);
	}

	public double commisionCal() {
		double sumOrders = 0.0;
		Iterator<Order> it = order.iterator();
		while (it.hasNext()) {
			sumOrders += it.next().getOrderAmount();
		}
		return commisionPersentage * sumOrders;
	}
}
