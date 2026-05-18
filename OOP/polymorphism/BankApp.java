package polymorphism;

public class BankApp {

	public static void main(String[] args) {

		SavingsAccount savings = new SavingsAccount("Alice", "SAV-001", 1000, 2.0);
		savings.displayAccount();
		System.out.println("Withdraw $950: " + savings.withdraw(950));
		savings.applyInterest();
		savings.displayAccount();

		System.out.println();

		CheckingAccount checking = new CheckingAccount("Bob", "CHK-002", 500, 300);
		checking.displayAccount();
		System.out.println("Withdraw $700: " + checking.withdraw(700));
		checking.displayAccount();
	}

}
