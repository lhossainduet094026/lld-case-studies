Problem with typical factory class:
---------------------------------------

class SimpleNotificationFactory {
    public static Notification createNotification(String type) {
        return switch (type) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}

when comes again new notification channel we need to modify it again . 
Violation of open for extension without modification.

* You need to give each type of notification its own responsibility for knowing how to create itself.
* The Factory Method Pattern takes the idea of object creation and hands it off to subclasses.

Instead of one central factory deciding what to create, you delegate the responsibility 
to specialized classes that know exactly what they need to produce.

In simpler terms:

--Each subclass defines its own way of instantiating an object.
--The base class defines a common interface for creating that object, but doesn’t know what the object is.
--The base class also often defines common behavior, using the created object in some way.