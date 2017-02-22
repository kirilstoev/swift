
import java.util.Scanner;

public class Task4a_PrintSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for(int i = 1; i < number - 1 ; i++) {
            System.out.print("* ");
            
            for(int j = 1; j < number - 1 ; j++) {
                System.out.print("  ");
            }

            System.out.println("* ");
        }
        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
