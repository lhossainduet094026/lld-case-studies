package factory;

public class SMSNotificationCreator extends NotificationCreator {

	@Override
	Notification createNotification() {

		return new SMSNotification();
	}

}
