package WelcomeToJava.interfaces;

import org.apache.commons.math3.linear.RealMatrix;

/**
 * Functional interface for printing matrices.
 */
@FunctionalInterface
public interface MatrixPrinter {
    void print(RealMatrix m);
}
