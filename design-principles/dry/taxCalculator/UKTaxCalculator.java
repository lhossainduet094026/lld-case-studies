package dry.taxCalculator;

public class UKTaxCalculator implements TaxCalculator {

	@Override
	public double calculateTax(double amount) {
		return amount * 0.15; // Duplicated tax logic
	}

	@Override
	public String getRegion() {
		return "UK";
	}
}
