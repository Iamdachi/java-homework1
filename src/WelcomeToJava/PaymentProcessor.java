package WelcomeToJava;

/**
 * Simulates payment handling and demonstrates a local class.
 */
public class PaymentProcessor {

    /**
     * Processes a payment and prints a receipt using a local class.
     * @param amount payment amount
     */
    public void processPayment(double amount) {
        class Receipt {
            private final double total;
            Receipt(double total) { this.total = total; }
            void print() { System.out.println("Receipt for $" + total); }
        }

        System.out.println("Processing $" + amount + "...");
        new Receipt(amount).print();
    }


}
