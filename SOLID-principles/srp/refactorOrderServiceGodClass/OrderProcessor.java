package srp.refactorOrderServiceGodClass;

public class OrderProcessor {

	private int orderCounter = 0;
	private InventoryManager inventoryManager;
	private NotificationService notificationService;

	public OrderProcessor(InventoryManager inventoryManager, NotificationService notificationService) {
		this.inventoryManager = inventoryManager;
		this.notificationService = notificationService;
	}

	public void placeOrder(String productId, int quantity, String customerEmail) {

		if (!inventoryManager.checkInventory(productId, quantity)) {
			System.out.println("Insufficient stock for " + productId);
			return;
		}

		inventoryManager.updateInventory(productId, quantity);

		double pricePerUnit = 100.0; // Simplified pricing
		double total = pricePerUnit * quantity;
		orderCounter++;
		String orderId = "ORD-" + orderCounter;	

		notificationService.sendNotification(customerEmail, orderId, total);
	}
}
