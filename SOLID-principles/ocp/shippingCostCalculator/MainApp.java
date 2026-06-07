package ocp.shippingCostCalculator;

public class MainApp {

	public static void main(String[] args) {
		double weight = 2.0;

		ShippingCostCalculator standard = new ShippingCostCalculator(new StandardShipping());
		ShippingCostCalculator express = new ShippingCostCalculator(new ExpressShipping());
		ShippingCostCalculator overnight = new ShippingCostCalculator(new OvernightShipping());
		ShippingCostCalculator international = new ShippingCostCalculator(new InternationalShipping());

		System.out.println("Standard: $" + standard.calculate(weight));
		System.out.println("Express: $" + express.calculate(weight));
		System.out.println("Overnight: $" + overnight.calculate(weight));
		System.out.println("International: $" + international.calculate(weight));
	}

}
