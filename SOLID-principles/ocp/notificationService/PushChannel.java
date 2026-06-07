package ocp.notificationService;

public class PushChannel implements NotificationChannel {

	@Override
	public void send(String message) {

		System.out.println("Sending PUSH: " + message);
	}
}
