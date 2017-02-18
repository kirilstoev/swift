
import java.util.Scanner;

public class Task4c_PrintChristmasTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int rowLength = (height - 2) * 2 - 1;

        for (int i = 0; i <= height - 2; i++) {
            String printResult = "";
            if (i == height - 2) {
                for (int l = 0; l < rowLength; l++) {
                    if (l < (rowLength / 2) || l >= rowLength - (rowLength / 2)) {
                        printResult += " ";
                    } else {
                        printResult += "*";
                    }
                }
                System.out.println(printResult);
                printResult = "";
                for (int m = 0; m < rowLength; m++) {
                    if (m < ((rowLength / 2) - 1) || m >= (rowLength - ((rowLength / 2) - 1))) {
                        printResult += " ";
                    } else {
                        printResult += "*";
                    }
                }
                System.out.println(printResult);
            } else {
                for (int n = 0; n < rowLength; n++) {
                    if (n < (rowLength - ((i * 2) + 1)) / 2 || n >= rowLength - (rowLength - ((i * 2) + 1)) / 2) {
                        printResult += " ";
                    } else {
                        printResult += "*";
                    }
                }
                System.out.println(printResult);
            }
        }
    }
}
