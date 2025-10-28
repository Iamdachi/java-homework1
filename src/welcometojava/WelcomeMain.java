package welcometojava;

import welcometojava.handlers.MatrixHandler;
import welcometojava.handlers.NotificationHandler;
import welcometojava.handlers.PaymentHandler;
import welcometojava.handlers.Sorter;

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
