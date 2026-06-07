package ocp.notificationService;

import java.util.List;

public class MainApp {

	public static void main(String[] args) {

		List<NotificationChannel> channels = List.of(new EmailChannel(), new SMSChannel(), new PushChannel(), new SlackChannel());

		NotificationService service = new NotificationService(channels);
		service.sendNotification("Your order has shipped!");
	}
}
