package dip.refactorOrderService;

public class OrderService {

	private final Database database;

	public OrderService(Database database) {
		this.database = database;
	}
	
	public void placeOrder(String orderId, String orderData) {
        System.out.println("Placing order: " + orderId);
        database.insert("orders", orderData);
        System.out.println("Order placed successfully.");
    }

    public String getOrder(String orderId) {
        return database.query("orders", orderId);
    }
}
