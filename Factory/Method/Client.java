package Factory.Method;

public class Client {
    public static void main(String[] args) {
        NotificationFactory factory;

        factory = new EmailFactory();
        Notification n1 = factory.createNotification();
        n1.notifyUser();

        factory = new SMSFactory();
        Notification n2 = factory.createNotification();
        n2.notifyUser();
    }
}
