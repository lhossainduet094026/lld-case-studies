package polymorphism;

public class BankAccount {

	private String ownerName;
	private String accountNumber;
	protected double balance;

	public BankAccount(String ownerName, String accountNumber, double balance) {
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public boolean deposit(double amount) {

		if (amount > 0) {
			this.balance += amount;
			return true;
		}

		return false;
	}

	public boolean withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			return true;
		}

		return false;
	}

	public void displayAccount() {

		System.out.printf("Owner Name: %s | Account Number: %s | Balance: %.2f%n", ownerName, accountNumber, balance);
	}
}
