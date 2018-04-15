package polymorphismTdp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Employee {
	private String EmployeeId;
	private static List<Paycheck> pyck = new ArrayList<>();

	public Employee(String employeeId) {
		EmployeeId = employeeId;
	}

	public Paycheck calcCompensation(int month, int year) {
		Paycheck pck = this.calcGrossPay(LocalDate.of(year, month, 1), this);
		pyck.add(pck);
		return pck;
	}

	public abstract Paycheck calcGrossPay(LocalDate dateRange, Employee e);

	public void print() {
		Iterator<Paycheck> it = pyck.iterator();
		while (it.hasNext()) {
			System.out.println(this.getEmployeeId() + " " + this.getClass().getSimpleName() + " " + it.next().getNetPay());
		}
	}
	public List<Paycheck> getListOfPayCheck(){
		return pyck;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

}
