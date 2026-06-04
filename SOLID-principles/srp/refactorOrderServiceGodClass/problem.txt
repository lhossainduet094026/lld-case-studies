import java.util.*;

// Before: One class doing three unrelated jobs
class OrderService {
    private Map<String, Integer> inventory = new HashMap<>();
    private List<String> orders = new ArrayList<>();

    public OrderService() {
        inventory.put("LAPTOP", 10);
        inventory.put("PHONE", 25);
        inventory.put("TABLET", 15);
    }

    public void placeOrder(String productId, int quantity, String customerEmail) {
        // Responsibility 1: Inventory check
        Integer stock = inventory.get(productId);
        if (stock == null || stock < quantity) {
            System.out.println("Insufficient stock for " + productId);
            return;
        }

        // Responsibility 2: Order processing
        double pricePerUnit = 100.0; // Simplified pricing
        double total = pricePerUnit * quantity;
        String orderId = "ORD-" + (orders.size() + 1);
        orders.add(orderId);

        // Responsibility 3: Update inventory
        inventory.put(productId, stock - quantity);

        // Responsibility 4: Send notification
        System.out.println("Email to " + customerEmail + ": Order " + orderId
            + " confirmed. Total: $" + total);
    }
}

// TODO: Refactor into OrderProcessor, InventoryManager, and NotificationService.

public class Main {
    public static void main(String[] args) {
        // After refactoring, usage should look like:
        // InventoryManager inventory = new InventoryManager();
        // NotificationService notifications = new NotificationService();
        // OrderProcessor processor = new OrderProcessor(inventory, notifications);
        // processor.placeOrder("LAPTOP", 2, "alice@example.com");
    }
}