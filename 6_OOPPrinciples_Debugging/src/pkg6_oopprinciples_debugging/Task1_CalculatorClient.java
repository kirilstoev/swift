package pkg6_oopprinciples_debugging;

import java.util.Scanner;

public class Task1_CalculatorClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String doWhile = "";
        do {
            String row = sc.nextLine();
            String[] newRow = row.split(" ");
            doWhile = newRow[0];
            if (!newRow[0].equals("END")) {
                switch (newRow[0]) {
                    case "SUM":
                        System.out.println(Calculator.sum(Float.parseFloat(newRow[1]), Float.parseFloat(newRow[2])));
                        break;
                    case "SUB":
                        System.out.println(Calculator.substract(Float.parseFloat(newRow[1]), Float.parseFloat(newRow[2])));
                        break;
                    case "MUL":
                        System.out.println(Calculator.multiply(Float.parseFloat(newRow[1]), Float.parseFloat(newRow[2])));
                        break;
                    case "DIV":
                        System.out.println(Calculator.divide(Float.parseFloat(newRow[1]), Float.parseFloat(newRow[2])));
                        break;
                    case "PER":
                        System.out.println(Calculator.percentage(Float.parseFloat(newRow[1]), Float.parseFloat(newRow[2])));
                        break;
                    default:
                        break;
                }
            }
        } while (!doWhile.equals("END"));
    }
}
