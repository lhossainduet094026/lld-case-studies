package ocp.notificationService;

public class EmailChannel implements NotificationChannel {

	@Override
	public void send(String message) {
		
		System.out.println("Sending EMAIL: " + message);
	}
}
