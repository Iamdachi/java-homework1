package welcometojava.handlers;

import welcometojava.interfaces.Payment;

/**
 * Handles payment processing using an anonymous inner class.
 */
public class PaymentHandler {
    public static void handlePayment() {
        Payment payment = new Payment() {
            @Override
            public void process(double amount) {
                System.out.println("Processing $" + amount + "...");
                new Object() {
                    void print() { System.out.println("Receipt for $" + amount); }
                }.print();
            }
        };
        payment.process(49.99);
    }
}
