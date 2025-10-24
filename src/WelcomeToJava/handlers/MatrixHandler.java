package WelcomeToJava.handlers;

import java.math.BigDecimal;
import java.math.RoundingMode;

import WelcomeToJava.interfaces.MatrixOperation;
import WelcomeToJava.interfaces.MatrixPrinter;
import org.apache.commons.math3.linear.*;
import static org.apache.commons.math3.linear.MatrixUtils.createRealMatrix;

/**
 * Handles matrix operations: creation, inversion, and printing.
 */
public class MatrixHandler {
    public static void handleMatrixOperations() {
        double[][] data = {
                {1,2,3},
                {0,1,4},
                {5,6,0}
        };

        MatrixOperation inverter = m -> new LUDecomposition(m).getSolver().getInverse();
        RealMatrix matrix = createRealMatrix(data);
        RealMatrix inv = inverter.apply(matrix);

        MatrixPrinter printer = (RealMatrix m) -> {
            for (double[] row : m.getData()) {
                for (double val : row) {
                    BigDecimal rounded = BigDecimal.valueOf(val).setScale(12, RoundingMode.HALF_UP);
                    System.out.print(rounded + " ");
                }
                System.out.println();
            }
        };

        printer.print(inv);
    }
}
