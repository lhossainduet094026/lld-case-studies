Exercise 2: NotificationService

Refactor NotificationService Class

Problem: A NotificationService has hardcoded notification channels (Email and SMS). 
Every time the business wants to add a new channel (Push, Slack, WhatsApp), the service must be modified. 
Refactor it to make it extensible so that new channels can be added without modifying existing code.

Requirements:

Define a NotificationChannel interface with a send(message) method
Create concrete implementations: EmailChannel, SMSChannel, PushChannel, SlackChannel
Refactor NotificationService to accept one or more NotificationChannel instances
The service should delegate sending to the channel without knowing its type

class NotificationService {
    public void sendNotification(String channel, String message) {
        if ("Email".equals(channel)) {
            System.out.println("Sending EMAIL: " + message);
            // Email-specific logic (SMTP, templates, etc.)
        } else if ("SMS".equals(channel)) {
            System.out.println("Sending SMS: " + message);
            // SMS-specific logic (Twilio, carrier API, etc.)
        } else {
            throw new IllegalArgumentException("Unknown channel: " + channel);
        }
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("Email", "Your order has shipped!");
        service.sendNotification("SMS", "Your order has shipped!");
    }
}

// TODO: Define a NotificationChannel interface with a send(message) method.
// TODO: Create EmailChannel, SMSChannel, PushChannel, and SlackChannel.
// TODO: Refactor NotificationService to accept a NotificationChannel.