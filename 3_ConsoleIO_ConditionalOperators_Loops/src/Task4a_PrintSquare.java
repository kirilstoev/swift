
import java.util.Scanner;

public class Task4a_PrintSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            String printSquare = "";
            if (i == 0 || i == number - 1) {
                //Assume it is first or last loop so we need to print whole row with *;
                for (int n = 0; n < number; n++) {
                    printSquare += '*';
                }
            } else {
                //Assume it is not first or last loop so we need to print first and last * only;
                for (int l = 0; l < number; l++) {
                    if (l == 0 || l == number - 1) {
                        printSquare += '*';
                    } else {
                        printSquare += ' ';
                    }
                }
            }
            System.out.println(printSquare);
        }
    }
}
