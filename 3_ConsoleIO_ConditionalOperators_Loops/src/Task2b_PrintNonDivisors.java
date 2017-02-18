
import java.util.Scanner;

public class Task2b_PrintNonDivisors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String printnum = "";
        for (int i = 0; i <= number; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                printnum +=  i + " ";
            }
        }
        System.out.println(printnum);
    }
}
