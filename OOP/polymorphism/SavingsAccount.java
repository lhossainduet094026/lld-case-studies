package polymorphism;

public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount(String ownerName, String accountNumber, double balance, double interestRate) {
		super(ownerName, accountNumber, balance);
		this.interestRate = interestRate;
	}

	@Override
	public boolean withdraw(double amount) {

		if ((balance - amount) >= 100) {
			balance -= amount;
			return true;
		}

		return false;
	}

	public void applyInterest() {
		balance += balance * interestRate / 100;
	}
}
