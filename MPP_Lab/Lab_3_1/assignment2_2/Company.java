package assignment2_2;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	List<Department> dep = new ArrayList<>();

	public Company(String name) {
		this.name = name;
	}

	public String print() {
		String result = "";
		for (int i = 0; i < dep.size(); i++) {
			result += dep.get(i).print();
		}
		return result;
	}

	public void creatDep(Department dept) {
		dep.add(dept);
	}

	public String getCompanyName() {
		return name;
	}

	public double getSalary() {
		double sum = 0;
		for(int i=0; i<dep.size(); i++) {
			sum += dep.get(i).getSalary();
		}
		return sum;
	}
}
