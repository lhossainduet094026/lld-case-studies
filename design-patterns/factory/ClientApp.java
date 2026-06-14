package factory;

public class ClientApp {

	public static void main(String[] args) {
		
		NotificationCreator notificationCreator;
		
		notificationCreator = new EmailNotificationCreator();
		notificationCreator.send("Welcome to our platform!");
	}
}
