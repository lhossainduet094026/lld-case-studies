package ocp.notificationService;

public class SlackChannel implements NotificationChannel {

	@Override
	public void send(String message) {
		System.out.println("Sending SLACK: " + message);

	}

}
