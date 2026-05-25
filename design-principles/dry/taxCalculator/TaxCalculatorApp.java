package dry.taxCalculator;

public class TaxCalculatorApp {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new UKTaxCalculator();
		OrderProcessor orderCalculator = new OrderProcessor(taxCalculator);
		orderCalculator.processOrder(100);
	}
}
