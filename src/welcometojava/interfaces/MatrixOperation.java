package welcometojava.interfaces;

import org.apache.commons.math3.linear.RealMatrix;

/**
 * Functional interface for matrix operations.
 */
@FunctionalInterface
public interface MatrixOperation {
    RealMatrix apply(RealMatrix m);
}
