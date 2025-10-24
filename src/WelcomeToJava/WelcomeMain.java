package WelcomeToJava;

import WelcomeToJava.handlers.MatrixHandler;
import WelcomeToJava.handlers.NotificationHandler;
import WelcomeToJava.handlers.PaymentHandler;
import WelcomeToJava.handlers.Sorter;

/**
 * This is the last part of homework.
 * Calls various handlers for matrices, notifications, sorting, and payments. Inside handlers are all anonymous classes/lambdas.
 */
public class WelcomeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");

        MatrixHandler.handleMatrixOperations();
        NotificationHandler.handleNotifications();
        Sorter.handleSorting();
        PaymentHandler.handlePayment();
    }
}
