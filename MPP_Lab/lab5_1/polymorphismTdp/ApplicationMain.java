package polymorphismTdp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ApplicationMain {

	public static void main(String[] args) {
		ApplicationMain app = new ApplicationMain();
		app.populate();
	}

	private void populate() {
		Employee emp1 = new Hourly("0001", 15, 50);
		Employee emp2 = new Hourly("0002", 18, 40);
		Employee emp3 = new Hourly("0003", 13, 60);
		Employee emp4 = new Hourly("0004", 18, 40);

		List<Order> list05 = Arrays.asList(new Order("0005", LocalDate.of(2018, 4, 1), 45000),
				new Order("0005", LocalDate.of(2018, 4, 1), 45000), new Order("0005", LocalDate.of(2018, 4, 1), 45000));
		List<Order> list06 = Arrays.asList(new Order("0006", LocalDate.of(2018, 4, 1), 45000),
				new Order("0006", LocalDate.of(2018, 4, 1), 45000), new Order("0006", LocalDate.of(2018, 4, 1), 45000));
		List<Order> list07 = Arrays.asList(new Order("0007", LocalDate.of(2018, 4, 1), 45000),
				new Order("0007", LocalDate.of(2018, 4, 1), 45000), new Order("0007", LocalDate.of(2018, 4, 1), 45000));
		List<Order> list08 = Arrays.asList(new Order("0007", LocalDate.of(2018, 4, 1), 45000),
				new Order("0007", LocalDate.of(2018, 4, 1), 45000), new Order("0007", LocalDate.of(2018, 4, 1), 45000));

		Employee emp5 = new Commisioned("0005", 2000, list05);
		Employee emp6 = new Commisioned("0006", 1500, list06);
		Employee emp7 = new Commisioned("0007", 3000, list07);
		Employee emp8 = new Commisioned("0008", 3200, list08);

		Employee emp9 = new Salaried("0009", 1500);
		Employee emp10 = new Salaried("0010", 1300);
		Employee emp11 = new Salaried("0011", 1400);
		Employee emp12 = new Salaried("0012", 1100);

		List<Employee> emp = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12);

		for (Employee e : emp) {
			Paycheck pk = e.calcCompensation(4, 2018);
			System.out.println(e.getEmployeeId() + " " + e.getClass().getSimpleName() + " " + pk.getNetPay());

		}
		
	}
}
