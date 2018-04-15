package stdProbPra3;

import java.util.*;

public class Admin {
	// Returns phone numbers (in sorted order) of the Library Members who have ever
	// checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();

		for (LibraryMember lmeb : members) {
			List<CheckoutRecordEntry> entryList = lmeb.getCheckoutRecord().getCheckoutEntryList();
			for (CheckoutRecordEntry itemRecord : entryList) {
				if (itemRecord.getItem().equals(item)) {
					phoneNums.add(lmeb.getPhone());
					break;
				}
			}
		}
		Collections.sort(phoneNums);
		return phoneNums;
	}
}
