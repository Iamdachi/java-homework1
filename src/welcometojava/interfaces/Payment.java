package welcometojava.interfaces;

/**
 * Functional interface for payment processing.
 */
@FunctionalInterface
public interface Payment {
    void process(double amount);
}
