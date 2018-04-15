package polymorphismTdp;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public final class DateRange {
	LocalDate startDate;
	LocalDate endDate;

	public DateRange(LocalDate payDay, LocalDate pay) {
		startDate = payDay;
		endDate = pay;
	}

	public boolean isInRange(Date d) {
		return false;
	}

	public LocalDate getFirstDayOfMonth() {
		return startDate;
	}

	public LocalDate getLastDayOfMonth() {
		return endDate;
	}

	@Override
	public String toString() {
		return "DateRange [startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
