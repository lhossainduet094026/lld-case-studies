package dry.taxCalculator;

public class USTaxCalculator implements TaxCalculator {

	@Override
	public double calculateTax(double amount) {
		return amount * 0.10; // Duplicated tax logic
	}

	@Override
	public String getRegion() {
		return "US";
	}
}
