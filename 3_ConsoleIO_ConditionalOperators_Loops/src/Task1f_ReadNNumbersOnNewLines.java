
import java.util.Scanner;

public class Task1f_ReadNNumbersOnNewLines {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        String numbers = "";
        for (int i = 0; i < rows; i++) {
            int digit = sc.nextInt();
            numbers += digit + " ";
        }
        System.out.println(numbers);
    }
}
