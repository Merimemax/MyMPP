package stdProbPra2;

public class Admin {
	Department[] dept;

	public Admin(Department[] depts) {
		dept = depts;
	}

	public String hourlyCompanyMessage() throws EmptyQueueException {
		String report = "";
		for (int i = 0; i < dept.length; i++) {
			report += format(dept[i].getName(), dept[i].nextMessage());
		}
		return report;

	}

	public String format(String name, String msg) {
		return name +" : "+ msg + "\n";
		
	}

}
