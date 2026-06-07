package ocp.shippingCostCalculator;

public class ShippingCostCalculator {

	private final ShippingStrategy shippingStrategy;

	public ShippingCostCalculator(ShippingStrategy shippingStrategy) {
		this.shippingStrategy = shippingStrategy;
	}

	public double calculate(double weight) {

		return shippingStrategy.calculateCost(weight);
	}
}
