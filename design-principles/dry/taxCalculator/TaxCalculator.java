package dry.taxCalculator;

public interface TaxCalculator {

	double calculateTax(double amount);
	
	String getRegion();
}
