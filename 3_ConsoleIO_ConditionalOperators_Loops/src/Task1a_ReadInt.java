
import java.util.Scanner;

public class Task1a_ReadInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your integer: ");
        int number = sc.nextInt();
        number += 1;
        System.out.println("Your number is: " + number);
    }

}
