package ocp.shippingCostCalculator;

public class InternationalShipping implements ShippingStrategy {

	@Override
	public double calculateCost(double weight) {
		return weight * 10.0;
	}

}
