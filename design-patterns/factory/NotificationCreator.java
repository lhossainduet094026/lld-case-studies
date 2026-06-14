package factory;

abstract class NotificationCreator {

	abstract Notification createNotification();

	public void send(String message) {
		Notification notification = createNotification();
		notification.send(message);
	}
}
