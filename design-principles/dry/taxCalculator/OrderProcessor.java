package dry.taxCalculator;

public class OrderProcessor {

	private final TaxCalculator taxCalculator;

	public OrderProcessor(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	public void processOrder(double amount) {
		double tax = taxCalculator.calculateTax(amount);
		double total = amount + tax;

		System.out.printf("%s order - subtotal: $%.2f amount , Tax: $%.2f , Total: $%.2f", taxCalculator.getRegion(),
				amount, tax, total);
	}

}
