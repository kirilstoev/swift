
import java.util.Scanner;

public class Task1b_AreEqual {

    static boolean areEqual(int number1, int number2) {
        if (number1 == number2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(areEqual(number1, number2));
    }

}
