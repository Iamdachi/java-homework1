package WelcomeToJava;

import org.apache.commons.math3.linear.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WelcomeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");

        double[][] data = {
                {1, 2, 3},
                {0, 1, 4},
                {5, 6, 0}
        };

        RealMatrix inv = MatrixUtils.invertMatrix(data);

        System.out.println("Inverse matrix:");
        for (double[] row : inv.getData()) {
            for (double val : row) {
                BigDecimal roundedValue = BigDecimal.valueOf(val).setScale(12, RoundingMode.HALF_UP);
                System.out.print(roundedValue + " ");
            }
            System.out.println();
        }
    }
}
