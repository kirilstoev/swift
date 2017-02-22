
import java.util.Scanner;

public class Task4b_PrintZFigure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i < number - 1; i++) {
            for (int j = 0; j < number; j++) {
                if (j == number - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
    }
}
