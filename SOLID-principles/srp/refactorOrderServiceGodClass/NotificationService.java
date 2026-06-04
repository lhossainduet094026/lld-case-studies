package srp.refactorOrderServiceGodClass;

public class NotificationService {

	public void sendNotification(String customerEmail, String orderId, double total) {
		// Responsibility 4: Send notification
		System.out.println("Email to " + customerEmail + ": Order " + orderId + " confirmed. Total: $" + total);
	}
}
