package Factory;

public class NotificationFactory {

    public Notification createNotification(String notificationFactory)
    {
        if (notificationFactory == null || notificationFactory.isEmpty())
            return null;
        switch (notificationFactory) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PUSHNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+notificationFactory);
        }
    }
}