package dry.taxCalculator;

public class EUTaxCalculator implements TaxCalculator {

	@Override
	public double calculateTax(double amount) {
		return amount * 0.20; // Duplicated tax logic
	}

	@Override
	public String getRegion() {
		return "EU";
	}
}
