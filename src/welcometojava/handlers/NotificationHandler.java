package welcometojava.handlers;

import welcometojava.interfaces.*;

/**
 * Handles sending notifications using email and SMS.
 * Demonstrates anonymous classes and lambdas.
 */
public class NotificationHandler {
    public static void handleNotifications() {
        Notifier emailNotifier = new Notifier() {
            @Override
            public void notifyUser(String user, String msg) {
                System.out.println("[NotifyMeApp] Email sent to " + user + ": " + msg);
            }
        };
        emailNotifier.notifyUser("dachi@zedginidze.com", "Welcome to NotifyMeApp!");

        Notifier smsNotifier = (user, msg) -> System.out.println("SMS sent to device " + user + ": " + msg);
        smsNotifier.notifyUser("555-551-552", "Your code is 0000001");
    }
}
