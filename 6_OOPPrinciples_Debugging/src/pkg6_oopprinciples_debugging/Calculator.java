package pkg6_oopprinciples_debugging;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Calculator {

    private static double sum = 0;

    public static String sum(float a, float b) {
        sum = a + b;
        NumberFormat formatter = new DecimalFormat("#0.000");
        return formatter.format(sum);
    }

    public static String substract(float a, float b) {
        sum = a - b;
        NumberFormat formatter = new DecimalFormat("#0.000");
        return formatter.format(sum);
    }

    public static String multiply(float a, float b) {
        sum = a * b;
        NumberFormat formatter = new DecimalFormat("#0.000");
        return formatter.format(sum);
    }

    public static String divide(float a, float b) {
        sum = a / b;
        NumberFormat formatter = new DecimalFormat("#0.000");
        return formatter.format(sum);
    }

    public static String percentage(float a, float b) {
        sum = a / 100 * b;
        NumberFormat formatter = new DecimalFormat("#0.000");
        return formatter.format(sum);
    }
}
