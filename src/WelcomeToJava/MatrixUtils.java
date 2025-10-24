package WelcomeToJava;

import org.apache.commons.math3.linear.*;

public class MatrixUtils {
    public static RealMatrix invertMatrix(double[][] data) {
        RealMatrix matrix = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(data);
        return new LUDecomposition(matrix).getSolver().getInverse();
    }
}