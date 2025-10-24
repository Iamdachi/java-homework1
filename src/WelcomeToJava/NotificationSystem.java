package WelcomeToJava;

/**
 * NotificationSystem represents a basic "system" for "sending" notifications.
 * It has:
 *  - An inner class (EmailNotification) that depends on the outer class instance and can access its fields.
 *  - A static nested class (SMSNotification) that works without any instance.
 */
public class NotificationSystem {
    private String appName = "NotifyMeApp";

    /**
     * Handles email-based notifications.
     * Can access outer class fields, like appName.
     */
    public class EmailNotification {
        public void send(String user, String msg) {
            System.out.println("[" + appName + "] Email sent to " + user + ": " + msg);
        }
    }

    /**
     * Handles SMS notifications to devices.
     * Static, so it doesn't need an instance of NotificationSystem.
     */
    public static class SMSNotification {
        public static void send(String deviceId, String msg) {
            System.out.println("SMS sent to device " + deviceId + ": " + msg);
        }
    }
}


