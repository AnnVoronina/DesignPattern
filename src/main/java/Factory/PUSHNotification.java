package Factory;

public class PUSHNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Send push");
    }
}
