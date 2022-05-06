package Factory;

public class MainNotification {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

        Notification notification1 = notificationFactory.createNotification("EMAIL");
        notification1.notifyUser();
    }


}
