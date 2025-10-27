package welcometojava;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.apache.commons.math3.linear.*;
import static org.apache.commons.math3.linear.MatrixUtils.createRealMatrix;

/**
 * Utility class for handling matrices: creation, inversion, and printing.
 */
public class MatrixUtils {

    private RealMatrix matrix;

    /** Create matrix from 2D array */
    public MatrixUtils(double[][] data) {
        this.matrix = createRealMatrix(data); // clean, no long prefix
    }

    /** Invert the stored matrix */
    public RealMatrix invert() {
        return new LUDecomposition(matrix).getSolver().getInverse();
    }

    /** Print matrix with 12 decimal rounding */
    public void printMatrix(RealMatrix mat) {
        for (double[] row : mat.getData()) {
            for (double val : row) {
                BigDecimal rounded = BigDecimal.valueOf(val).setScale(12, RoundingMode.HALF_UP);
                System.out.print(rounded + " ");
            }
            System.out.println();
        }
    }
}
