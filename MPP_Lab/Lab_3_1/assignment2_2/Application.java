package assignment2_2;

import java.util.Scanner;

public class Application {
	Company com = new Company("XYZ LTD");
	static Position ceoPos;
	static Department depp;

	public static void main(String[] args) {
		Application app = new Application();
		app.populateApplication();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out
					.println("\nhi, press E to see all employee\n" + "or press S to see total salary of all employee\n"
							+ "or press P to see position of all employee\n" + "or press R printReportingHierarchy\n"
							+ "or Q to quit\n");

			String showEmporSal = scan.next();
			switch (showEmporSal.toUpperCase()) {
			case "E":
				System.out.println(app.com.print() + "\n");
				break;
			case "S":
				System.out.printf("Total Salary of all employee is $%.2f\n\n", app.com.getSalary());
				break;
			case "P":
				ceoPos.printDownLine();
				break;
			case "R":
				depp.printReportingHierarchy();
				break;
			case "Q":
				scan.close();
				return;

			default:
				System.out.println("invalid entry");

			}
		}
	}

	private void populateApplication() {
		Department dep = new Department("CEO general Manager", com);
		depp = dep;
		Employee generalManager = new Employee(10, "Lyle", "int11", "lname11", "ssn11", 110000);
		Position ceo = new Position("CEO", "president of the company", dep, generalManager, null);
		ceoPos = ceo;

		Employee saleDeptHead = new Employee(10, "Ron", "int10", "lname10", "ssn10", 100000);
		Employee mktDeptHead = new Employee(9, "Anne", "int9", "lname9", "ssn9", 90000);

		Employee saleDeptHead1 = new Employee(7, "stan", "int7", "lname7", "ssn7", 70000);
		Employee saleDeptHead2 = new Employee(8, "Peter", "int8", "lname8", "ssn8", 80000);

		Employee emp1 = new Employee(1, "Tom", "int1", "lname1", "ssn1", 10000);
		Employee emp2 = new Employee(2, "Sue", "int2", "lname2", "ssn2", 20000);
		Employee emp3 = new Employee(3, "Mark", "int3", "lname3", "ssn3", 30000);

		Employee emp4 = new Employee(4, "Bill", "int4", "lname4", "ssn4", 40000);
		Employee emp5 = new Employee(5, "Dan", "int5", "lname5", "ssn5", 50000);

		Employee emp6 = new Employee(6, "Gary", "int6", "lname6", "ssn6", 60000);

		Department dep1 = new Department("Sales department", com);
		Department dep2 = new Department("Marketing department", com);

		Position saleHead = new Position("sales Dept Head", "president of the company", dep1, saleDeptHead, ceo);
		Position mktHead = new Position("mkt Dept Head", "president of the company", dep2, mktDeptHead, ceo);

		Position supervisor1 = new Position("supervisor1", "supervise 3 empl", dep1, saleDeptHead1, saleHead);
		Position supervisor2 = new Position("supervisor2", "supervise 2 empl", dep1, saleDeptHead2, saleHead);

		Position pos11 = new Position("sales person1", "sales1", dep1, emp1, supervisor1);
		Position pos12 = new Position("sales person2", "sales2", dep1, emp2, supervisor1);
		Position pos13 = new Position("sales person3", "sales3", dep1, emp3, supervisor1);

		Position pos21 = new Position("seles person4", "sales4", dep1, emp4, supervisor2);
		Position pos22 = new Position("seles person5", "sales5", dep1, emp5, supervisor2);

		Position pos23 = new Position("Marketer", "Makert person", dep2, emp6, mktHead);
		
		dep1.addPosition(pos11);
		dep1.addPosition(pos12);
		dep1.addPosition(pos13);

		dep1.addPosition(pos21);
		dep1.addPosition(pos22);
		dep1.addPosition(pos23);

		ceo.addInferiors(saleHead);
		ceo.addInferiors(mktHead);

		saleHead.addInferiors(supervisor1);
		saleHead.addInferiors(supervisor2);

		mktHead.addInferiors(pos23);

		supervisor1.addInferiors(pos11);
		supervisor1.addInferiors(pos12);
		supervisor1.addInferiors(pos13);

		supervisor2.addInferiors(pos21);
		supervisor2.addInferiors(pos22);

		com.creatDep(dep1);
		com.creatDep(dep2);

	}
}
