package stdProbPra3;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem item;
	private ItemType itemType;

	public CheckoutRecordEntry(LendingItem item, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.item = item;
		this.itemType = itemType;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getItem() {
		return item;
	}

	public ItemType getItemType() {
		return itemType;
	}

}
