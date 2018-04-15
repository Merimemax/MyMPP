package stdProbPra3;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	List<CheckoutRecordEntry> chkoten = new ArrayList<>();

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return chkoten;
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		chkoten.add(entry);
	}

}
