
import java.util.Scanner;

public class Task1b_AreEqual {

    static void Equals(int number1, int number2) {
        System.out.println(number1 == number2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        Equals(number1, number2);
    }

}
