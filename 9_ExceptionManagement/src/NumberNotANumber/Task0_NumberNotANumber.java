package NumberNotANumber;

import java.util.Scanner;

public class Task0_NumberNotANumber {

    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        String readRow = "";
        while (!readRow.equals("END")) {
            readRow = sc.nextLine();
            if (!readRow.equals("END")) {
                try {
                    Integer.parseInt(readRow);
                    System.out.println("Number");
                } catch (NumberFormatException ex) {
                    System.out.println("Not a number.");
                }
            }
        }
    }
}
