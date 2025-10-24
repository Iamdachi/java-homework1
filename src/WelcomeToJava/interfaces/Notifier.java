package WelcomeToJava.interfaces;

/**
 * Functional interface for notifications.
 */
@FunctionalInterface
public interface Notifier {
    void notifyUser(String user, String msg);
}

