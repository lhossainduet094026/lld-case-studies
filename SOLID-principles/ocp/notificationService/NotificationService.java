package ocp.notificationService;

import java.util.List;

public class NotificationService {

	private final List<NotificationChannel> channels;

	public NotificationService(List<NotificationChannel> channels) {
		this.channels = channels;
	}

	public void sendNotification(String message) {
		for (NotificationChannel channel : channels) {
			channel.send(message);
		}
	}
}
