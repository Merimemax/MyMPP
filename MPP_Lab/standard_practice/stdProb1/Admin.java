package stdProb1;

import java.util.Iterator;
import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double sum = 0.0;
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			sum += it.next().computeUpdatedBalanceSum();
		}
		return sum;
	}
}
