package factory;

public class EmailNotificationCreator extends NotificationCreator {

	@Override
	Notification createNotification() {
		return new EmailNotification();
	}

}
