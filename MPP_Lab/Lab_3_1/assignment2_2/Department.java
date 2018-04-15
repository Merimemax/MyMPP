package assignment2_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department {
	private String name;
	private String location;
	private Company comp;
	private Employee posLead;
	
	List<Position> positions = new ArrayList<>();

	public Department(String name, Company comp) {
		this.name = name;
		this.comp = comp;
	}

	public Company getComp() {
		return comp;
	}

	public void setComp(Company comp) {
		this.comp = comp;
	}

	public List<Position> getPositions() {
		return positions;
	}

	public String print() {
		String result = "";
		for (int i = 0; i < positions.size(); i++) {
			result += positions.get(i).print() + "\n";
		}
		return result;
	}

	public void printReportingHierarchy() {
		Position headPositionsInDepartment = null;

		for (Iterator<Position> iterator = positions.iterator(); iterator.hasNext();) {
			Position position = iterator.next();
			if (!positions.contains(position.getSuperior())) {
				headPositionsInDepartment = position;
			}
		}

		System.out.println(headPositionsInDepartment);
	}

	public void addPosition(Position p) {
		positions.add(p);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		double sum = 0;
		for (int i = 0; i < positions.size(); i++) {
			sum += positions.get(i).getSalary();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}

}
