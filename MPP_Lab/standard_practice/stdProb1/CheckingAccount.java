package stdProb1;

final public class CheckingAccount extends Account {
	private double balance;
	private double monthlyFee;
	private String acctId;

	public CheckingAccount(String acctId, double fee, double startBalance) {
		this.acctId = acctId;
		this.monthlyFee = fee;
		this.balance = startBalance;
	}

	@Override
	public String getAccoutID() {
		return acctId;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance - monthlyFee;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}


	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
