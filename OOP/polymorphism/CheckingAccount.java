package polymorphism;

public class CheckingAccount extends BankAccount {

	private double overdraftLimit;

	public CheckingAccount(String ownerName, String accountNumber, double balance, double overdraftLimit) {
		super(ownerName, accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public boolean withdraw(double amount) {
		if ((balance + overdraftLimit) >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
}
