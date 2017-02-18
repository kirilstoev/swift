
import java.util.Scanner;

public class Task2e_PrintFirstDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num >=10) {
            num /= 10;
        }
        System.out.println(num);
    }
}
