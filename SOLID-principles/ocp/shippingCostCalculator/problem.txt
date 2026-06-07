Exercise 1: ShippingCostCalculator

Refactor ShippingCostCalculator Class

Problem: A ShippingCostCalculator uses if-else to determine the shipping cost based on the shipping type 
(Standard, Express, Overnight, International). Every time a new shipping type is added, someone has to modify the calculator. 
Refactor this so that new shipping types can be added without modifying the calculator.

Requirements:

Define a ShippingStrategy interface with a calculateCost(weight) method
Create concrete implementations: StandardShipping, ExpressShipping, OvernightShipping, InternationalShipping
Refactor ShippingCostCalculator to accept a ShippingStrategy instead of a string
The calculator should delegate cost computation to the strategy

class ShippingCostCalculator {
    public double calculate(String shippingType, double weight) {
        if ("Standard".equals(shippingType)) {
            return weight * 1.5;
        } else if ("Express".equals(shippingType)) {
            return weight * 3.0;
        } else if ("Overnight".equals(shippingType)) {
            return weight * 5.0;
        } else if ("International".equals(shippingType)) {
            return weight * 10.0;
        }
        throw new IllegalArgumentException("Unknown shipping type: " + shippingType);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        System.out.println("Standard: $" + calculator.calculate("Standard", 2.0));
        System.out.println("Express: $" + calculator.calculate("Express", 2.0));
    }
}

// TODO: Define a ShippingStrategy interface with a calculateCost(weight) method.
// TODO: Create concrete implementations for each shipping type.
// TODO: Refactor ShippingCostCalculator to accept a ShippingStrategy.