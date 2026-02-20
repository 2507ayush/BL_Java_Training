package Factory.Method;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email Notification");
    }
}
