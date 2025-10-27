package welcometojava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.math3.linear.*;

public class WelcomeMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Java");

        handleMatrixOperations();
        handleNotifications();
        handleSorting();
        handlePayment();
    }

    /**
     * Using External library perform matrix operations: creates a matrix, inverts it, and prints the result.
     */
    private static void handleMatrixOperations() {
        double[][] data = {
                {1, 2, 3},
                {0, 1, 4},
                {5, 6, 0}
        };
        MatrixUtils utils = new MatrixUtils(data);
        RealMatrix inv = utils.invert();
        System.out.println("Inverse matrix:");
        utils.printMatrix(inv);
    }

    /**
     * Sends example email and SMS notifications using NotificationSystem to demonstrate inner/nested classes.
     */
    private static void handleNotifications() {
        NotificationSystem system = new NotificationSystem();
        NotificationSystem.EmailNotification email = system.new EmailNotification();
        email.send("dachi@zedginidze.com", "Welcome to NotifyMeApp!");

        NotificationSystem.SMSNotification.send("555-551-552", "Your code is 0000001");
    }

    /**
     * Sorts a list of integers in descending order and prints it to demonstrate anonymous class.
     */
    private static void handleSorting() {
        List<Integer> nums = Arrays.asList(5, 1, 9, 3, 7);
        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        System.out.println("Descending order: " + nums);
    }

    /**
     * Processes a sample payment of a fixed amount to demonstrate local class.
     */
    private static void handlePayment() {
        new PaymentProcessor().processPayment(49.99);
    }
}
