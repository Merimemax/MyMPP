package stdProb1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final public class Employee {
	private String name;
	List<Account> acc;
	public Employee(String name) {
		this.name = name;
		acc = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void addAccount(Account acct) {
		acc.add(acct);
		
	}
	public double computeUpdatedBalanceSum() {
		double sum = 0.0;
		Iterator<Account> it = acc.iterator();
		while(it.hasNext()) {
			sum += it.next().computeUpdatedBalance();
		}
		return sum;
	}
}
